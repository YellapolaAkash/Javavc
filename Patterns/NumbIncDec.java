package Patterns;

public class NumbIncDec {

	public static void main(String[] args) {
		for(int x=1;x<5;x++)
		{
			for(int sp=1;sp<x;sp++)
			{
				System.out.print(" ");
			}
			for(int y=x;y<=5;y++)
			{
				System.out.print(" " +y);
			}
			System.out.println("");
		
		}
		for(int i=5;i>=1;i--)
		{
			for(int sp=i;sp>1;sp--)
			{
				System.out.print(" ");
			}
		
			for(int j=i;j<=5;j++)
			{
				System.out.print(" " +j);
			}
			System.out.println(" ");
		
		}
	}

}
