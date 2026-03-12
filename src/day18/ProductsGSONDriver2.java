package day18;

import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ProductsGSONDriver2 {

	public static void main(String[] args) {
		Gson gson = new Gson();

        try {

            FileReader reader = new FileReader("myfolder/productlist.json");

            List<Product> Products = gson.fromJson(
                    reader,
                    new TypeToken<List<Product>>(){}.getType()
            );

            for(Product Product : Products)
                System.out.println(Product);

            // display male Products
            System.out.println("LIST OF MALE ProductS");

            for(Product product : Products)
                if(product.getCategory().equalsIgnoreCase("electronics"))
                    System.out.println(product.getTitle());

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

	}

}
