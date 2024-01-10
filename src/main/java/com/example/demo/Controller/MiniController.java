package com.example.demo.Controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Services.StudentService;

@Controller
public class MiniController 
{
	StudentService ss;
public MiniController(StudentService ss) {
		super();
		this.ss = ss;
	}
@GetMapping("/AddStu")
public String addingStudent()
{
	return "AddStu";
}
@PostMapping("/astud")
public String addStudent(@RequestParam("kodId")String kodId,@RequestParam("name")String name,@RequestParam("branch")String branch)
{
Student s=new Student(kodId,name,branch);
ss.addStudent(s);
return "index";	
}
@GetMapping("/updateStu")
public String updatingStudent()
{
	return "UpdateStudent";
}
@PutMapping("/ustud")
public String updateStudent(@RequestParam("kodId")String kodId,@RequestParam("name")String name,@RequestParam("branch")String branch)
{
	Student st=ss.getStudent(kodId);
	st.setName(name);
	st.setBranch(branch);
	ss.updateStudent(st);
	return "index";
}
@GetMapping("/viewinfo")
public String viewInfo()
{
	return "ViewStudents";
}
@GetMapping("/viewstu")
public String getStudent(@RequestParam("kodId") String kodId,Model model)
{
	Student st=ss.getStudent(kodId);
	model.addAttribute("Student",st);
	return "ShowDetails";
}
@GetMapping("/DelStu")
public String deletePage()
{
	return "DelStudent";
}
@GetMapping("/index")
public String indexpage()
{
	return "index";
}
@DeleteMapping("/delstud")
public String deleteStudent(@RequestParam("kodId") String kodId)
{
	ss.deleteStudent(kodId);
	return "index";
}
@GetMapping("/viewAllStu")
public String getAllStudent(Model model)
{
	List<Student> student=ss.getAllStudent();
	model.addAttribute("Student",student);
	return "ShowAllDetails";
}
}
