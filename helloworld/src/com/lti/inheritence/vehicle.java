package com.lti.inheritence;
 
class ageexception extends exception{
public ageexception(string msg) {
	super(message);
}
}
class verifyage{
	void ageverification(int age)  throws ageexception {
		if(age<18)
			throw new ageexception("invalid age");
		System.out.println("age verifies");
	}
}
public class UDTDemo{
	public static void main(String[] args) {
	verifyage va=new verifyage();
	
	try {
		va.ageverification(S);
	}
	catch (ageexception e) {
		System.out.println(e.getmessage());
	}
	}
}