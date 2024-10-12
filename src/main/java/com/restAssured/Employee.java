package com.restAssured;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee {
 
	int rollno;
	String name;
	int [] mob;
	public Employee(int rollno,String name,int [] mob)
	{
		this.rollno=rollno;
		this.name=name;
		this.mob=mob;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMob() {
		return mob;
	}
	public void setMob(int[] mob) {
		this.mob = mob;
	}
	

}
