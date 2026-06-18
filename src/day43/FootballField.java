package day43;

public class FootballField extends Rectangle
{
	public FootballField(int l,int w)
	{
		super(l,w);
	}

	@Override
	public void area() {
		System.out.println("Area of Football Field is "+(this.length*this.width));
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Football Field is "+ (2*(this.length+this.width)));
		
	}

}
