package Patterns;

public class PrimePattern {

	public static void main(String[] args) {
		int z=1,count=0;;
		for(int x=1;x<=4;x++)
		{
			for(int y=1;y<=x;y++)
			{
				++z;
				for(;z>0;z++)
				{
					count=0;
					for(int a=2;a<=z/2;a++)
					{
						if(z%a==0)
						{
							count++;
							
						}
						
					}
					if(count==0)
					{
						System.out.print( " " +z);
						break;
					}
					
				}
								
			}
			System.out.println(" ");
			
		}

	}

}
