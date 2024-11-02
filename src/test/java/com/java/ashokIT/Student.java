package com.java.ashokIT;

public class Student {

	//instance variable  
String name; 
int age;  //24

//String gender;
char gender; // 'M' ,'F'
String rollNumber;

	
public Student(String name, int age, char gender, String rollNumber, long integer) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.rollNumber = rollNumber;
	this.integer = integer;
}

public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	if(age<0) {
		
		
		throw new IllegalArgumentException("Invalid Exception");
	}
	this.age = age;
}

public void setName(String name) {
	this.name = name;
}


public Student() {
	// TODO Auto-generated constructor stub
	
}

long  integer= 875473897;

public static String collegeName = "VIKAS COLLEGE";


	//state, behaviour
	// Identity 
public void attendClass(String courseName) {

	System.out.println("Student is Attending class :"+courseName);
	
}

public void enrollCourse() {
	
	
	System.out.println(" Enrolled in Course");
	
}
	//instant variabale 
	
	

}
