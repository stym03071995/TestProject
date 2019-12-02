package interfac;

public class Point {
	private int x,y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
	return x+" "+y;
	}
	@Override
	public boolean equals(Object p)
	{
		return x==((Point)p).x && y==((Point)p).y;
	}
	

}
