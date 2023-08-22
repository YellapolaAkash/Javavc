package Patterns;

public class UnderscorePattern {
	public static void main (String[] args)
	{
	for (int x=1;x<=6;x++)	
	{
		for(int sp=5;sp>=x;sp--)
		{
			System.out.print("_"+" ");
		}
		for(int z =1;z<=x;z++)
		{
			System.out.print("*"+" ");
		}
		System.out.println("");
	}
	}

}
