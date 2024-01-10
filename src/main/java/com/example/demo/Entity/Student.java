package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
String kod_Id;
String name;
String branch;
public String getKodId() {
	return kod_Id;
}
public void setKodId(String kodId) {
	this.kod_Id = kodId;
}
public Student() {
	super();
	
}
public Student(String kod_Id,String name, String branch) {
	super();
	this.kod_Id=kod_Id;
	this.name = name;
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [kodId=" + kod_Id + ", name=" + name + ", branch=" + branch + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
}
