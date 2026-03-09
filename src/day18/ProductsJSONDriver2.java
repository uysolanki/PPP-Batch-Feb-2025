package day18;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductsJSONDriver2 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
        try
        {
            List<Product> products = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\ITP-PPP1\\myfolder\\productlist.json"),	   //absolute path
                new File("myfolder/productlist.json"),							              //relative path
                new TypeReference<List<Product>>() {}
            );
            
          // System.out.println(products);
            for(Product product:products)
            	System.out.println(product);
       
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}

///ITP-PPP1/myfolder/productlist.json
