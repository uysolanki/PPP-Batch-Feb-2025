package day28;

public class SingleThreadDemo {

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
			System.out.println(i);
		
		for(int i=2000;i<=3000;i++)
			System.out.println("\t"+i);

	}

}
