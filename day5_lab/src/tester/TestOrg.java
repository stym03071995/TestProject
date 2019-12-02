package tester;
import java.util.Scanner;
import  static organization.Employee.*;
import   organization.*;

import static java.lang.System.*;
public class TestOrg {

	public static void main(String []arg)
	{
		int eid=0,count=0;
		Scanner sc=new Scanner(in);
		System.out.println("Enter No. of employee ");
        Employee[] e=new Employee[sc.nextInt()];	
        boolean exit=false;
        while(!exit)
        {
        	out.println("1: Hire worker\n 2 : Hire Manger 3: Display  4. Check empid  \t 5: update salary \t 6 : exit"
        			+ "");
        switch(sc.nextInt())
        {
        case 1:
        {
        	System.out.println("Name \t Email  \t Dept id \t Basic Salary  \t  working hours \t hours rate");
        	Worker w=new Worker(sc.next(),sc.next(),1,sc.nextDouble(),sc.nextInt(),sc.nextInt());
        	addEmployee(w,e);	
        	  }break;
        case 2:
        {
        	System.out.println("Name \t Email \t  Basic Salary \t Dept id \t  Performances Bonus");
        	
        	Manager m=new Manager(sc.next(),sc.next(),sc.nextDouble(),2,sc.nextDouble());
           addEmployee(m,e);
       
 }break;
        case 3:
        {
        	for(Employee emp: e)
        		System.out.println("Employee Details :"+emp.toString());
             
        }
        break;
        case 4:
        {
        	
        	System.out.println("Enter the empid to be search");
        	eid=sc.nextInt();
        	for(Employee emp:e)
        	{
        		if(eid == emp.getId())
        		{
        			count=1;
        			System.out.println("Employee Details :"+emp.toString());	
        	             break;
        		}
        		
        	}
        	if(count==0)
        	{
        		System.out.println("Invaild choice");
        	}
        		
        } break;
        case 5:
        {
        	System.out.println("Enter valid id");
        	System.out.println("Enetr updated salary");
        	int d=sc.nextInt();
       double s=sc.nextDouble();
       for(int i=0;i<e.length;i++)
       {
    	   if(e[i].getId()==d)
    	   {
    		   System.out.println("Old"+e[i].calculateSal()); 
    		   
    		   e[i].setBasic(s);
    		   
    		   System.out.println("updated"+ e[i].calculateSal()); 
    		   
    		  
    		   e[i].toString();
    		   break;
    	   }
       }
        	
        	
        	
        }break;
        
        case 6:
        {
        	System.out.println("Enter empid and deptid");
        	int id=sc.nextInt();
        	for(int i=0;i<e.length;i++)
        	{
        	if(e[i].getId()==id)
        	{
        		if(e[i].getDeptId()==1)
        		{
        			 System.out.println(((Worker)e[i]).gethourlyrate());
        		}
        		else if(e[i].getDeptId()==2)
        		{
       			 System.out.println(((Manager)e[i]).getPerformance());
       		}
        	else
        	{
        	System.out.println("Invalid id");	
        	}
        }
        	}
        }break;
        
        
        case 7:
        {
        	exit=true;
        }break;
        
        }
       
        }
}}
	

