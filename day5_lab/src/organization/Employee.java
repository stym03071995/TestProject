package organization;

public  abstract class Employee {
	public static int counter;
	private int id,deptId;
	private String name,email;
	private double basic;
	static double bas;
	static int id_count;
	static
	{
		id_count=100;
	}
	public Employee(String name,String email,int deptId,double basic)
	{
		bas=basic;
		this.basic=basic;
		this.name=name;
		this.email=email;
		this.deptId=deptId;
		this.basic=basic;
		id=++id_count;
	}
	@Override
	public String toString()
	{
		
		return "Emp Details :"+id+" "+name+" "+email+" "+basic+" "+deptId;
	}
	public  static double getBasic() {
		
		  
		return bas;
	}
	public static void  addEmployee(Employee e,Employee []emp)
	{
		if(counter< emp.length)
		{
			emp[counter++]=e;
		}
		else
		{
			System.out.println("List is full");
		}
	}	
	public int getId()
	{
		return id;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setBasic(double s)
	{
		bas+=s;
	}
	
	public abstract double calculateSal();
	//public abstract int gethourlyrate();

}
	
	


