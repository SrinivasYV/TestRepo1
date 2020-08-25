package test.java;

import org.testng.annotations.Test;

public class Fibonacci {
		
	     @Test
	     
	     public static void CheckNumSeries()  
	     {    
	     int n1=0,n2=1,n3,i,count=10;    
	     System.out.print(n1+" "+n2);
	    
	     for(i=2;i<count;++i) 
	     {    
	     n3=n1+n2;    
	     System.out.print(" "+n3);    
	     n1=n2;    
	     n2=n3;    
	     }    
	  
	}
	}  


