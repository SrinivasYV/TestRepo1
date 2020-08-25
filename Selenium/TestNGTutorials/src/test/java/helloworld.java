package test.java;

import org.testng.annotations.Test;

public class helloworld {
	
	@Test
	public void fibonacci() {
		
		int n = 10, t1 = 0, t2 = 1;
	    System.out.print("First " + n + " terms: ");

	    for (int i = 1; i <= n; ++i)
	    {
	        System.out.print(t1 + " + ");

	        int sum = t1 + t2;
	        t1 = t2;
	        t2 = sum;
	    }
	    
			}

@Test
public void sample() {
	
	System.out.println("hi good morning");
	
	
		}


@Test
public void test() {
	
	System.out.println("Have Breakfast");
	
	
		}

@Test
public void text() {
	
	System.out.println("Lunch is Ready Please come to dining Hall");
	
		}

@Test
public void number() {
	
	System.out.println("Tea is Ready with Sancks and also Birthday Celebration");
	
	
		}


@Test
public void sum() {
	
	int num1 = 5, num2 = 15, sum;
    sum = num1 + num2;
    System.out.println("Sum of these numbers: "+sum);
		}

@Test
public void leapyear() {
	
	int year = 2016;
    System.out.println();        
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
    else
            System.out.println("Year " + year + " is not a leap year");
            System.out.println();
	
	
		}

@Test
public void Message() {
	
	System.out.println("Complete your work");
	
	
		}

}