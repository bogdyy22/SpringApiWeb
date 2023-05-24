package com.example.springapi.server;

import com.example.springapi.api.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
   private List<Student> studentList;

   public StudentService(){
       studentList = new ArrayList<>();

       Student student = new Student(1, "Bogdan Mihai","Upit","It");
       Student student1 = new Student(2, "Mircea Bravo","Upit","Serviciuri");
       Student student2 = new Student(3, "Radu","Ase","Art");
       Student student3 = new Student(4, "Michael","Poli","It");
       Student student4 = new Student(5, "Lorenz","Poli","Arhitectura");
       Student student5 = new Student(6, "Fuego","Gre","Istorie");
       Student student6 = new Student(7, "Bondar","Goals","Istorie");
       studentList.addAll(Arrays.asList(student,student1,student2,student3,student4,student5,student6));
   }

   public Optional<Student> getStudent(Long id){
       Optional optional = Optional.empty();
       for(Student student : studentList){
           if(id == student.getId()){
               optional = Optional.of(student);
               return optional;
           }
       }
       return optional;
   }
}
