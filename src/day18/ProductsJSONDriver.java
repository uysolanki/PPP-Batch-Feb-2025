package day18;

import java.io.File;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductsJSONDriver {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
        try
        {
            Product product = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("myfolder/singleproduct.json"),							//relative path
                new TypeReference<Product>() {}
            );
            
           System.out.println(product);
       
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
