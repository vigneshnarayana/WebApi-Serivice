package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	Integer sid;
    @Column(name="sname")
    String sname;  
    @Column(name="score")
    Integer score;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", score=" + score + "]";
	}
	public Student(Integer sid, String sname, Integer score) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.score = score;
	}
	public Student() {
			}
	
	

}
