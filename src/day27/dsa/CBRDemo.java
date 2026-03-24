package day27.dsa;

public class CBRDemo {
public static void main(String[] args) {
	int arr[]= {10,20};
	System.out.println("Arr[0] = "+arr[0]);  //Arr[0]=10
	demo(arr);
	System.out.println("Arr[0] = "+arr[0]);  //Arr[0]=99
}

private static void demo(int brr[]) 
{
	System.out.println("Brr[0] = "+brr[0]);	//Brr[0]=10
	brr[0]=99;
	System.out.println("Brr[0] = "+brr[0]);	//Brr[0]=99
}
}
