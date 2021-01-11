package com.lti.casestudy;

import java.util.Scanner;

class Student
{
	int id;
	
	String name;
	String dob;
	public Student(int id,String name,String dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}

class Info
{
	public void display(Student student)
	{
		System.out.println("The details of this student is ");
		System.out.println("Name "+student.getName());
		System.out.println("ID is "+student.getId());
		System.out.println("DOB is "+student.getDob());
		System.out.println("---------------------------");
	}
}
public class app {
	public void scenario1()
	{
		Student s1=new Student(100,"Sai Bharghav","20-09-1996");
		Student s2=new Student(101,"Tinku","17-08-1998");
		Student s3=new Student(102,"Avinash","10-01-1999");
		Student s4=new Student(103,"Karnati","29-12-1998");
		Info I1=new Info();
		I1.display(s1);
		I1.display(s2);
		I1.display(s3);
		I1.display(s4);
	}
	
	public void scenario2()
	{
		Student[] sa=new Student[3];
		sa[0]=new Student(106,"Janardhan","13-06-1998");
		sa[1]=new Student(107,"Bindu Pallavi","01-01-1998");
		sa[2]=new Student(108,"Sushma","31-06-1998");
		Info I2=new Info();
		for(int i=0;i<sa.length;i++)
		{
			I2.display(sa[i]);
		}
		
	}
	
	public void scenario3()
	{
		Scanner sc=new Scanner(System.in);
		Student[] sa1=new Student[2];
		System.out.print("Please enter ID ");
		int id1=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter Name");
		StringBuffer sb1=new StringBuffer();
		sb1.append(sc.nextLine());
		System.out.println("Please enter DOB");
		StringBuffer sb2=new StringBuffer();
		sb2.append(sc.nextLine());
		sa1[0]=new Student(id1,sb1.toString(),sb2.toString());
		sb1.delete(0,sb1.length());
		sb2.delete(0,sb2.length());
		System.out.print("Please enter ID ");
		id1=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter name");
		sb1.append(sc.nextLine());
		System.out.print("Please enter DOB");
		sb2.append(sc.nextLine());
		sa1[1]=new Student(id1,sb1.toString(),sb2.toString());
		Info II=new Info();
		for(int i=0;i<sa1.length;i++)
		{
			System.out.println("The details of student "+i+" are");
			II.display(sa1[i]);
		}
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		app a= new app();
		a.scenario3();
	}

}
class course
{
	int id,fees;
	String name,duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
}