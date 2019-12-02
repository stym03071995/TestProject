package tester;
import java.util.Scanner;

import interfac.Circle;
import interfac.Computable;
import interfac.Rectangle;
public class TesterShapes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int counter=0;
	     System.out.println("How many shape required");
	     Computable []pt=new Computable[sc.nextInt()];
	     boolean exit=false;
	     while(!exit)
	     {
	    	 System.out.println("1 : for Circle\n 2 : Rectangle\n 3 : Display 4: exit ");
	    	 switch(sc.nextInt())
	    	 {
	    	 case 1:
	    	 {
	    		 if(counter<pt.length)
	    		 {
	    			 pt[counter++]=new Circle(sc.nextInt(),sc.nextInt(),sc.nextInt());
	    				 
	    		 }
	    		 else
	    		 {
	    			 System.out.println("No more space ");
	    		 }
	    		 }break;
	    	 case 2:
	    	 {
	    		 if(counter<pt.length)
	    		 {
	    			 pt[counter++]=new Rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
	    				 	 }
	    		 else
	    		 {
	    			 System.out.println("No more space ");
	    		 }
	    	 }break;
	    		 
	    	 case 3:
	    	 {
	    		 int flag=0;
	    		 /*if(counter==pt.length)
	    		 {*/
	    		 for(Computable com:pt)
	    		 {
	    			 if(flag==counter)
	    			 {
	    				 break;
	    			 }
	    			 System.out.println(com.areaShape());
	    			 System.out.println(com.perimeterShape());
	    			 if( com instanceof Circle)
	    			 {
	    				 flag++;
	    				 ((Circle)com).drawArc();
	    			 }
	    			 else
	    			 {
	    				 flag++;
	    				 ((Rectangle)com).diagonals();
	    			 }
	    			 }
	    		/* }
	    		 else
	    		 {
	    			 for(int i=0;i<counter;i++)
	    			 {
	    				 System.out.println(pt[i].areaShape());
		    			 System.out.println(pt[i].perimeterShape());
		    			 if( pt[i] instanceof Circle)
		    			 {
		    				 ((Circle)pt[i]).drawArc();
		    			 }
		    			 else
		    			 {
		    				 ((Rectangle)pt[i]).diagonals();
		    			 }
		    			 }	 
	    			 }*/
	    		 }
	    		 
	    	 break;
	    	 case 4 :
	    	 {
	    		 exit=true;
	    	 }break;
	    	 }
	     }
	}
}

	     


