package day9;

public class Tyre {
	
	private double tyreRadius;
	private String tyreMfgName;
	private String tyreMaterial;
	
	public Tyre() {}		//No Args Constructor
	public Tyre(double tyreRadius, String tyreMfgName,String tyreMaterial) //All Args Constructor
	{
		this.tyreRadius = tyreRadius;
		this.tyreMfgName = tyreMfgName;
		this.tyreMaterial = tyreMaterial;
	}
	public double getTyreRadius() {
		return tyreRadius;
	}
	public void setTyreRadius(double tyreRadius) {
		this.tyreRadius = tyreRadius;
	}
	public String getTyreMfgName() {
		return tyreMfgName;
	}
	public void setTyreMfgName(String tyreMfgName) {
		this.tyreMfgName = tyreMfgName;
	}
	public String getTyreMaterial() {
		return tyreMaterial;
	}
	public void setTyreMaterial(String tyreMaterial) {
		this.tyreMaterial = tyreMaterial;
	}
	
	@Override
	public String toString() {
		return "Tyre [tyreRadius=" + tyreRadius + ", tyreMfgName=" + tyreMfgName + ", tyreMaterial=" + tyreMaterial
				+ "]";
	}
	
	//boiler plate code
	
	

}
