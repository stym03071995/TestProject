package organization;
import static organization.Employee.*;

public class Manager extends Employee {
	private double perfBonus;
	public Manager(String n,String e,double b,int d,double perfBonus)
	{
		super(n,e,d,b);
		this.perfBonus=perfBonus;
	}
	@Override
	public String toString()
	{
		
	return super.toString()+" "+perfBonus;
	}
	public double calculateSal()
	{
		return Employee.getBasic()+perfBonus;
	}
	public double getPerformance()
	{
		return perfBonus;
	}
	}
	

