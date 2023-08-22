package Patterns;

public class UnderscoreIncPattern {

	public static void main(String[] args) {
		for(int x=1;x<=5;x++)
		{
			for(int sp=1;sp<x;sp++)
			{
				System.out.print("_"+" ");
			}
			for(int z=5;z>=x;z--)
			{
				System.out.print("*"+ " ");
			}
			System.out.println(" ");
		}

	}

}
