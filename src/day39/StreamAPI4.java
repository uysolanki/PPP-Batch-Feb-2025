package day39;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import day18.Product;

public class StreamAPI4 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		 List<Product> products=null;
        try
        {
            products = mapper.readValue(
            	  new File("myfolder/productlist.json"),							              //relative path
                new TypeReference<List<Product>>() {}
            );
            
 //         System.out.println(products);
            for(Product product:products)
            	System.out.println(product);
       
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Product p=new Product();
       double totalPrice= products.stream().map(prod->prod.price).reduce((acc,price)->acc+price).get();
       System.out.println(totalPrice);
       
       double totalElecPrice= products.stream().filter((prod)->prod.getCategory().equals("electronics")).map(prod->prod.price).reduce((acc,price)->acc+price).get();
       System.out.println(totalElecPrice);
       
       double totalPrice1= products.stream().mapToDouble(prod->prod.getPrice()).sum();
       System.out.println(totalPrice1);
       
       double totalPrice2= products.stream().mapToDouble(Product::getPrice).sum();
       System.out.println(totalPrice2);
       
       //display length of all titles
       products.stream().map(prod->prod.getTitle().length()).forEach(System.out::println);
       System.out.println("***");
       products.stream().map(Product::getTitle).map(title->title.length()).forEach(System.out::println);
       System.out.println("***");
       StreamAPI4 obj=new StreamAPI4();
     
       //display price of max jewelery
       double maxPriceOfJewelry=products.stream().filter((prod)->prod.getCategory().equals("jewelery")).mapToDouble(prod->prod.getPrice()).max().orElse(0.0);
       System.out.println(maxPriceOfJewelry);
       
       System.out.println("$$$$");
       System.out.println(products.stream().filter((prod)->prod.getCategory().equals("jewelery")).sorted().limit(1).toList());
	}

	public void hello()
	{ 	
		 List<Product> products=new ArrayList();
		 products.stream().map(Product::getTitle).map(StreamAPI4::test).forEach(System.out::println);
	}
	
	public static int test(String str)
	{
		return str.length();
	}
}
