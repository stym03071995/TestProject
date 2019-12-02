package interfac;

public class Circle extends Point implements Computable {
	private int radius;
	public Circle(int t,int r, int radius)
	{
		super(t,r);
		this.radius=radius;
	}
	//@Override
	public String toString()
	{
	return "Details of Circle: "+super.toString()+" "+radius;
	}
	
	public double areaShape()
	{
	return PI*radius*radius;
	}
	public double perimeterShape()
	{
	return 2*PI*radius;
	}
	public void drawArc()
	{
	System.out.println("Drawing arc in class Circle");
	}
	

}
