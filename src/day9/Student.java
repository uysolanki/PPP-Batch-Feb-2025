package day9;

public class Student {

	
	int rno;
	String name;
	
	public Student() {}
	
	public Student(int rno,String name) throws NullPointerException
	{
		
		this.rno=rno;
		this.name=name;
		
	}

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

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	
	
	
}
