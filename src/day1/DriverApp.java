package day1;

public class DriverApp {

	public static void main(String[] args) {
		
		Amitabh a1;
		
		Abhishek a2;
		
		Aradhya a3;
		
		a1=new Amitabh();
		a1.home();				//Jalsa
		
		a1=new Abhishek();		//New Jalsa
		a1.home();
		
		a1=new Aradhya();		//New Jalsa
		a1.home();
		
		
		a2=new Abhishek();
		a2.home();				//New Jalsa
		a2.car();				//Audi
		a2=new Aradhya();
		a2.home();				//New Jalsa
		a2.car();				//Audi
		
		
		a3=new Aradhya();
		a3.home();			 	//New Jalsa
		a3.car();				//Audi
		a3.office();			//Bandra Office
		
		
		
	}

}
