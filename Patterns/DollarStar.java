package Patterns;

public class DollarStar {

	public static void main(String[] args) {
		int x=1;
	for(x=1;x<=4;x++)
	{
		for(int y=1;y>0;y--)
		{
			System.out.print("*");
		}
    

    
	for(int z=1;z<=x;z++)
		{
			if(x==1 && z==1)
				System.out.print("");
		
			else if(z==1||x-z==1||x-z==2)
				    System.out.print("$");
			else
				System.out.println("*");
	

				
		}
		
		System.out.println("");
		}
	
	}
	
}

