package Patterns;

public class LeftTriangle {

	public static void main(String[] args) {
		for(int x=1;x<=5;x++)
		{
			for(int s=4;s>=x;s--)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=x;y++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=1;i<=4;i++)
		{
			for(int s2=1;s2<=i;s2++)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
