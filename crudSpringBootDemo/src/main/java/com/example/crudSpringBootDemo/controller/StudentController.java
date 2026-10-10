package com.example.crudSpringBootDemo.controller;

import com.example.crudSpringBootDemo.entity.Student;
import com.example.crudSpringBootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
 private StudentService studentService;

 public StudentController(StudentService studentService){
     this.studentService=studentService;
 }

//createStudent
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
//        System.out.println(student.getAge());
//        System.out.println(student.getEmail());

//        System.out.println("Inside Student Controller.");
       Student createdStudent =  studentService.createStudent(student);
//        System.out.println("Exiting Student Controller.");
       return  ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

//    read one student
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
    Student studentResp = studentService.getStudent(id);

    if(studentResp == null){
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
      return ResponseEntity.ok(studentResp);
    }

//   get all Student
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent( ){
        List<Student> studentList = studentService.getAllStudent();

        if(studentList.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(studentList);
    }

//    update
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentReq){

     Student studentResp =  studentService.updateStudent(id,studentReq);

     if(studentResp == null){
         return ResponseEntity.notFound().build();
     }

     return ResponseEntity.ok(studentResp);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
     Boolean isDeleted = studentService.deletStudent(id);

     if(!isDeleted){
       return   ResponseEntity.notFound().build();
     }

     return ResponseEntity.ok("Record Deleted");
    }

}
