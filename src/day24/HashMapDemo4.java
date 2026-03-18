package day24;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class HashMapDemo4 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Map<String, Map<String, List<Product>>>>  foods=null;
        try
        {
        	foods = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("myfolder/foods.json"),							//relative path
                new TypeReference<Map<String, Map<String, Map<String, List<Product>>>>>() {}
            );
            
       
        } catch (Exception e) {
            e.printStackTrace();
        }


		System.out.println(foods);

	}

}
