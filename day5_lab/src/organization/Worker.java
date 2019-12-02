package organization;
import static organization.Employee.*;
public class Worker extends Employee {
private int hoursWorked, hourlyRate;
public Worker(String n,String e,int d,double b,int hw,int hr ){
	 super(n,e,d,b);
	 hoursWorked=hw;
	 hourlyRate=hr;
	
}
@Override
public String toString()
{
	System.out.println("Worker");
	return super.toString()+" "+hoursWorked+" "+hourlyRate;
	
	}

public double calculateSal()
{
	return  getBasic()+(hoursWorked*hourlyRate);
	}
public int gethourlyrate()
{
	return hourlyRate;
	}

}
