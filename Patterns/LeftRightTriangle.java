package Patterns;

public class LeftRightTriangle {

	public static void main(String[] args) {
		int x,z,k;
		for(x=1;x<=4;x++)
		{
			for(z=4;z>x;z--)
			{
				System.out.print(" " +" ");
			}
			for(k=1;k<=x;k++)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println("");
		}
	}

}
