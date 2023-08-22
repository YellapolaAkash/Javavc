package Patterns;


public class ElevenPattern {

	public static void main(String[] args) {
	
		for(int x=1;x<=5;x++)
		{
			for(int sp=5;sp>=x;sp--)
			{
				System.out.print(" ");
			}
			
			
			for(int y=1;y<=x;y++)
			{
			
				if((y==1)||(x==y))
				{
					System.out.print(1+" ");
				}
				else if((y==2)||(x-y==1))
				{
					System.out.print((x-1)+" ");
				}
				else
					System.out.print((x+1)+" ");
				
			}
			System.out.println(" ");
				
		}
	}

}
