package day18;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ProductsGSONDriver {

	public static void main(String[] args) {
		Gson gson = new Gson();

		try {

			FileReader reader = new FileReader("myfolder/singleproduct.json");

			Product product = gson.fromJson(reader, new TypeToken<Product>() {
			}.getType());
			
			System.out.println(product);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
