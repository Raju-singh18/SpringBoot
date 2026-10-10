package com.example.crudSpringBootDemo.repository;

import com.example.crudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    public Student saveStudent(Student student){
//      save to db
//        System.out.println("Inside Student Repository.");
//        System.out.println("Exiting Student Repository.");

//        Student s1 = new Student();
//        s1.setName("Raju");
//        s1.setAge(22);
//        s1.setEmail("raju@gmail.com");
//        s1.setRollNo(101);
//        s1.setSubject("Spring framework");

// return null;
//    }
}
