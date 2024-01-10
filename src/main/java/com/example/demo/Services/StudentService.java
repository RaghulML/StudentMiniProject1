package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService 
{
String addStudent(Student s);
Student getStudent(String kodId);
List<Student> getAllStudent();
String updateStudent(Student s);
String deleteStudent(String kodId);

}