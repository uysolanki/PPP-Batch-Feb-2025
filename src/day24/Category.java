package day24;

import java.util.List;
import java.util.Map;

public class Category {
	private Map<String,List<Product>> foods;

	public Map<String, List<Product>> getCategory() {
		return foods;
	}

	public void setCategory(Map<String, List<Product>> category) {
		this.foods = category;
	}

	@Override
	public String toString() {
		return "Foods [foods=" + foods + "]";
	}
	
	

}
