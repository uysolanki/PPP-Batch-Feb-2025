package day15;

import java.io.Serializable;

public class Student implements Serializable
{
	private static final long serialVersionUID =1L;
	int rno;		//object scope
	String sname;	//object scope
	int age;		//object scope
	
	transient String deptName;  //object scope
	static String collegeName="Kendra Vidhyalay"; //class scope
	
	public Student() {}
	public Student(int rno, String sname,int age) 
	{
		this.rno = rno;
		this.sname = sname;
		this.age = age;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + "]";
	}
}
