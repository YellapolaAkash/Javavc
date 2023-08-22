package Patterns;

public class Xstar {

	public static void main(String[] args) {
		for(int x=5;x>=1;x--)
		{
			for(int sp=5;sp>x;sp--)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=x;y++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=5;i++)
		{
			for(int s1=5;s1>i;s1--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* " );
			}
			System.out.println(" ");
		}

	}

}
