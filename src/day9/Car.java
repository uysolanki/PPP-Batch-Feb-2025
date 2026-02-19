package day9;

public class Car {
	
	private String carModelName;
	private String carMfgName;
	private String carColor;
	private double carPrice;
	
	private Tyre t1;
	private Engine e1;
	
	public Car() {}
	public Car(String carModelName, String carMfgName, String carColor, double carPrice, Tyre t1, Engine e1) {
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.t1 = t1;
		this.e1 = e1;
	}
	
	public Car(Car temp) {
		this.carModelName = temp.carModelName;
		this.carMfgName = temp.carMfgName;
		this.carColor = temp.carColor;
		this.carPrice = temp.carPrice;
		this.t1 = temp.t1;
		this.e1 = temp.e1;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCarMfgName() {
		return carMfgName;
	}
	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public Tyre getT1() {
		return t1;
	}
	public void setT1(Tyre t1) {
		this.t1 = t1;
	}
	public Engine getE1() {
		return e1;
	}
	public void setE1(Engine e1) {
		this.e1 = e1;
	}
	@Override
	public String toString() {
		return "Car [carModelName=" + carModelName + ", carMfgName=" + carMfgName + ", carColor=" + carColor
				+ ", carPrice=" + carPrice + ", t1=" + t1 + ", e1=" + e1 + "]";
	}
	
	

}
