package Patterns;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		while(true) 
		{
			System.out.println("yes/no");
			String S=sc.nextLine();
			if(S.equals("yes")) 
			{
			System.out.println("enter num");
			int r=sc.nextInt();
		    count=0;
			for(int j=1;j<=r;j++)
			{
				if(r%j==0)
				{
				count++;
				}	
			}
		
			if(count==2)
			{
				System.out.println("prime:"+r);
			}
			else
				System.out.println("not prime");
			}
			if(S.equals("no")) {
				break;
			}
		}
			
		
	}
		
		

	}


