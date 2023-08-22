package Patterns;

public class Triangle {

	public static void main(String[] args) {
		for (int x=1;x<=5;x++)
		{                      
			for(int sp=4;sp>=x;sp--)
			{
				System.out.print(" ");
				
			}
			for(int z=1;z<=x;z++)
			{
				System.out.print("*");
			}
			
		
		for(int m=1;m<x;m++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	}
	}


