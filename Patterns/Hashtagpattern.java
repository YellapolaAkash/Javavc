package Patterns;

public class Hashtagpattern {

	public static void main(String[] args) {
	int n=13;	
	for(int x=1;x<=n;x++)
	{
		for(int y=1;y<=x;y++)
		{   
			if(x%2!=0)
			System.out.print("*");
			else
				System.out.print("#");		  	
	
		}
	   System.out.println(" ");
	}
	for(int k=1;k<=n-1;k++)
	{
		for(int z=n-1;z>=k;z--)
		{
			if(k%2!=0)
			System.out.print("*");
			else
				System.out.print("#");
		}
		System.out.println(" ");
	}
	}

	

}
