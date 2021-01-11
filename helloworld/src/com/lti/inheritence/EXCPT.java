package com.lti.inheritence;
import java.util.Scanner;
public class ExceptQuesi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		try
		{
			if(a<=0 || b<=0)
				throw new ArithmeticException("Invalid exception Range");
			else {
				int c=b;
				if (a<b)
					c=a;
				int d=Math.abs(a-b),i=0;
				while(i!=d)
				{
					System.out.println(c+i);
					i+=1;
				}
				System.out.println(c+i);
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}