package day24;

public class Product {
private int prodId;
private String prodTitle;
private int prodQty;
private int prodPrice;
public Product() {}
public Product(int prodId, String prodTitle, int prodQty, int prodPrice) {
	this.prodId = prodId;
	this.prodTitle = prodTitle;
	this.prodQty = prodQty;
	this.prodPrice = prodPrice;
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdTitle() {
	return prodTitle;
}
public void setProdTitle(String prodTitle) {
	this.prodTitle = prodTitle;
}
public int getProdQty() {
	return prodQty;
}
public void setProdQty(int prodQty) {
	this.prodQty = prodQty;
}
public int getProdPrice() {
	return prodPrice;
}
public void setProdPrice(int prodPrice) {
	this.prodPrice = prodPrice;
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodTitle=" + prodTitle + ", prodQty=" + prodQty + ", prodPrice="
			+ prodPrice + "]";
}


}
