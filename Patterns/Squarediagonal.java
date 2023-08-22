package Patterns;

public class Squarediagonal {

	public static void main(String[] args) {
		int n=7;
		for(int x=1;x<=n;x++)
		{
			for(int y=1;y<=n;y++)
			{
				if((x==1)||(y==n)||(x==n)||(y==n)||(y==1)||(x+y==n+1)||(x-y==0))
						
					System.out.print("*"+"");

				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
