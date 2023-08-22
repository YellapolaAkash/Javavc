package Patterns;

public class ArmstrongPattern
{
	public static void main(String[] args)
	{
		int a=152,count=0, sum=0,rem=0,z=0,m, temp;
		for(int x=1;x<=3;x++)
		{
			for(int y=1;y<=x;y++)
			{
				a=++a;
				for(;a>0;a++)
				{  
					count=0;
					for(m=a;m>0;m/=10)
					{
						count++;
					}
				  
					sum=0;
					for(z=a;z>0;z/=10)
					{
						rem=z%10;
					    sum=sum+(int)Math.pow(rem, count);
					}
					if(sum==a)
					{
						System.out.print(a + " ");
						break;
					}
				}
			}
			System.out.println(" ");
		}
	}
}
