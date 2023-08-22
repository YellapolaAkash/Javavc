package Patterns;
public class StarDollar 
{
	public static void main(String[] args) 
	{
		for(int x=1;x<=4;x++)
		{
			if(x==1)
			{
				System.out.print("*");
			}
			for(int z=1;z<=x;z++)
			{
				if((z==1)|| (z-x==1))
				{
					System.out.print("*");
				}
				else if(x==z || x-z==1)
				{
					System.out.print("$");
				}
				else
					System.out.print("$");
			}
			System.out.println(" ");
		}

	}

}
