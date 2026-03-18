package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapDemo5 {

	public static void main(String[] args) {
		Map<String,List<Product>> veg = new HashMap();

		veg.put("dairy", new ArrayList(Arrays.asList(new Product(1,"Milk",100,60),new Product(2,"Cheese",200,200),new Product(3,"Butter",300,260))));
		veg.put("vegetable", new ArrayList(Arrays.asList(new Product(4,"Brinjal",50,20),new Product(5,"Potato",60,30),new Product(5,"Lady Finger",70,40))));
		veg.put("fruit", new ArrayList(Arrays.asList(new Product(7,"Apple",80,200),new Product(8,"Mango",90,120),new Product(9,"Banana",100,60))));


		Map<String,List<Product>> nonveg = new HashMap();

		nonveg.put("egg", new ArrayList(Arrays.asList(new Product(10,"Hen Eggs",100,60),new Product(11,"Duck Eggs",200,200),new Product(12,"Ostrich Eggs",300,260))));
		nonveg.put("meat", new ArrayList(Arrays.asList(new Product(13,"Chicken",50,20),new Product(14,"Mutton",60,30),new Product(15,"Fish",70,40))));


		Category category=new Category();
		category.setCategory(veg);
		category.setCategory(nonveg);

		System.out.println(category);

	}

}
