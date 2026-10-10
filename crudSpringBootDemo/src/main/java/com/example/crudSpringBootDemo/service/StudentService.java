package com.example.crudSpringBootDemo.service;

import com.example.crudSpringBootDemo.entity.Student;
import com.example.crudSpringBootDemo.repository.StudentRepository;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

   public Student createStudent(Student student){

//       System.out.println("Inside Student Service.");
//      Student studentResp =  studentRepository.saveStudent(studentReq);
       student.setDeleted(false);
       Student studentResp = studentRepository.save(student);
//       System.out.println("Exiting Student Service.");
      return  studentResp;
   }

   public Student getStudent(Long id){
//     Optional<Student> studentResp =  studentRepository.findById(id);

       Optional<Student> studentResp = studentRepository.findByIdAndDeletedIsFalse(id);

     if(studentResp.isPresent()){
         return studentResp.get();
     }

     return null;
   }

   public List<Student> getAllStudent(){
    List<Student> studentList =  studentRepository.findByDeletedIsFalse();
    return studentList;
   }

   public Student updateStudent(Long id, Student studentReq){
     Optional<Student> existingStudent =  studentRepository.findByIdAndDeletedIsFalse(id);

     if(existingStudent.isEmpty()){
         return  null;
     }

     Student studentToSave = existingStudent.get();

     studentToSave.setName(studentReq.getName());
     studentToSave.setSubject(studentReq.getSubject());
     studentToSave.setRollNo(studentReq.getRollNo());
     studentToSave.setEmail(studentReq.getEmail());
     studentToSave.setAge(studentReq.getAge());
     studentToSave.setDeleted(true);

    return  studentRepository.save(studentToSave);
   }

   public Boolean deletStudent(Long id){
     Boolean isStudent = studentRepository.existsById(id);

     if (!isStudent){
        return false;
     }

     studentRepository.deleteById(id);

     return true;

   }

   public Boolean deleteStudentSoftly(Long id){

       Optional<Student> existingStudent= studentRepository.findByIdAndDeletedIsFalse(id);

       if(existingStudent.isEmpty()){
           return false;
       }

       Student studentToSave = existingStudent.get();
       studentToSave.setDeleted(true);

       studentRepository.save(studentToSave);

       return true;

   }
}
