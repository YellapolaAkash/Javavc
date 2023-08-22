package NestedLoops;
import java.util.Scanner;
public class FibbPrime {

	public static void main(String[] args) 
	{
		int x,a=1,b=0,c=0,count=0;
		System.out.println(b);
		
		for(x=1;x<=20;x++)
		{
			count=0;
			for(int y=2;y<=x/2;y++)
			{
				if(x%y==0) 
				{
					count++;
				}
			}
			if(count==0) 
			{
				System.out.println("      "+x);
			
		
		        c=a+b;
		        b=a;
		        System.out.println(b);
		        a=c;  
	    	
			}
		   
		
	    }
		
		
		
	}
	
}