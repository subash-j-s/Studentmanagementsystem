package com.student.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")

public class StudentRegistration {

	@Id
	private int sno;

	private String name;
	private	String course;
	private Date dob, doj;
	private String mobile;
	private String email;
	private String time;
	private String Trainer;

	public int getSno() {
		return sno;
	}
	public void setStudNo(int studNo) {
		this.sno = studNo;
	}
	public String getName() {
		return name;
	}
	public void setStudName(String studName) {
		this.name = studName;
	}

	public String getStudCourse() {
		return course;
	}

	public void setStudCourse(String studCourse) {
		this.course = studCourse;
	}

	public Date getDob() {
		return dob;
	}
	public void setStudDOB(Date studDOB) {
		this.dob = studDOB;
	}
	public Date getDoj() {
		return doj;
	}
	public void setStudDOJ(Date studDOJ) {
		this.doj = studDOJ;
	}
	public String getStudMobile() {return mobile;}
	public void setStudMobile(String studMobile) {this.mobile = studMobile;}
	public String getEmail() {return email;}
	public void setStudEmail(String studEmail) {this.email = studEmail;}

	public String getStudTime() {
		return time;
	}

	public void setStudTime(String studTime) {
		this.time = studTime;
	}

	public String getStudTrainer() {
		return Trainer;
	}

	public void setStudTrainer(String studTrainer) {
		this.Trainer = studTrainer;
	}

	@Override
	public String toString() {
		return "StudentRegistration{" +
				"sno=" + sno +
				", name='" + name + '\'' +
				", course='" + course + '\'' +
				", dob=" + dob +
				", doj=" + doj +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", time='" + time + '\'' +
				", Trainer='" + Trainer + '\'' +
				'}';
	}
}

