package day4;

public enum Planet {

	MERCURY(),
	VENUS(200.0,10.0),
	EARTH(300.0,11.0),
	MARS(400.0,12.0),
	JUPITER(500.0,13.0),
	SATURN(600.0,14.0),
	URANUS(700.0,15.0),
	NEPTUNE(800.0,16.0),
	PLUTO(900.0,17.0);
	
	double mass;
	double diameter;
	
	private Planet() {}
	private Planet(double m,double d)
	{
		this.mass=m;
		this.diameter=d;
	}
	
	public double calculateGravity()
	{
		return this.mass/(this.diameter*this.diameter);
	}
}
