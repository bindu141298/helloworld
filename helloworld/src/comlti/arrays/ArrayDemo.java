package comlti.arrays;
import java.util.Scanner;

class EmployeeP{
	private int empno;
	private String ename;
	EmployeeP(int empno,String ename) {
		this.empno=empno;
		this.ename=ename;	
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}

public class ArrayDemo {
	public static void main(String[] args) {
		EmployeeP e[];
		e=new EmployeeP[3];
		e[0]=new EmployeeP(101, "Arun");
		e[1]=new EmployeeP(102, "Tarun");
		e[2]=new EmployeeP(103, "Varun");
		
		for(int i=0;i<e.length;i++) {
			System.out.println("Empno:"+e[i].getEmpno());
			System.out.println("Emp name:"+e[i].getEname());
		}
	}

}