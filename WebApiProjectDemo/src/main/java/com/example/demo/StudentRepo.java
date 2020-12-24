package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface StudentRepo extends JpaRepository<Student, Integer> {

	
	public List<Student> findByScore(Integer score);


	public List<Student> findBySname(String sname);
	
	
	public List<Student> findByScoreGreaterThan(Integer score);
	
//
//    @Query("selet * form Student where score=?1 ")
//	public List<Student> findByScoreOrdered(Integer score);
}
