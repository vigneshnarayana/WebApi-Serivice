package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepo  repo;
	@GetMapping("students")
	public List<Student> getStudent(){
		return repo.findAll();
		
	}
	@GetMapping("students/{id}")
	public Optional<Student> getDatails(@PathVariable("id")Integer sid) {
		return repo.findById(sid);
		
	}
	@PostMapping("students")
	public Optional<Student> postData(@RequestBody Student student) {
		repo.save(student);
		return repo.findById(student.getSid());
	}
	@PutMapping("students")
	public Optional<Student> updateData(@RequestBody Student student) {
		repo.save(student);
		return repo.findById(student.getSid());
	}
	
	@GetMapping("students/score/{score}")
	public List<Student> getDatailsByScore(@PathVariable("score")Integer score) {
		return  repo.findByScore(score);
		
	}
	@GetMapping("students/score/gr/{score}")
	public List<Student> getDatailsByScoregreater(@PathVariable("score")Integer score) {
		return  repo.findByScoreGreaterThan(score);
		
	}
	
//	@GetMapping("students/score/or/{score}")
//	public List<Student> getDatailsByScoregreaterOrder(@PathVariable("score")Integer score) {
//		return  repo.findByScoreOrdered(score);
//		
//	}

}
