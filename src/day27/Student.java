package day27;

public class Student implements Cloneable,Comparable<Student>
{
	private int rno;
	private String name;
	private double per;
	public Student() {}
	public Student(int rno, String name, double per) {
		this.rno = rno;
		this.name = name;
		this.per = per;	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}
	
	@Override
	protected Student clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}
	
//	@Override
//	public int compareTo(Student s1) {
//		if(this.getRno()>s1.getRno())
//			return 1;
//		else if(this.getRno()<s1.getRno())
//			return -1;
//		else
//			return 0;
//	}
	
	
//	@Override
//	public int compareTo(Student s1) {
//		if(this.getPer()>s1.getPer())
//			return -1;
//		else if(this.getPer()<s1.getPer())
//			return 1;
//		else
//			return 0;
//	}
	
	@Override
	public int compareTo(Student s1) {
		return this.getName().compareTo(s1.getName());
	}
}
