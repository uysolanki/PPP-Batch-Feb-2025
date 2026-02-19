package day9;

import java.io.IOException;

public class Abhishek extends Amitabh
{
//	@Override
//	public void home() 									//blank allowed
//	{
//		System.out.println("New Jalsa");
//	}
	
//	@Override
//	public void home() throws RuntimeException			//same type allowed
//	{
//		System.out.println("New Jalsa");
//	}
	
//	@Override
//	public void home() throws NullPointerException		//child type allowed
//	{
//		System.out.println("New Jalsa");
//	}
	
	@Override
	public void home() throws Exception 				//parent not allowed
	{
		System.out.println("New Jalsa");
	}
}
