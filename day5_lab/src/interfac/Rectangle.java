package interfac;

public class Rectangle extends Point implements Computable {
  
	private int width,length;
	
	public Rectangle(int x,int y,int w,int l)
	{
		super(x,y);
		width=w;
		length=l;
	}
	public String toString()
	{
		return "Details of Rectangle :"+super.toString()+" "+width+" "+length;
	}
	public double areaShape()
	{
		return length*width;
	}
	public double perimeterShape()
	{
		return (2*(length+width));
	}
	public void diagonals()
	{
		System.out.println("Diagonal of Length are equal in length");
	}
	
}
