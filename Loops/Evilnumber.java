package loops;

public class Evilnumber 
{

	public static void main(String[] args) 
	{
	int a=9;int x=1,pro=1,sum=0,m=0;
		while(x<=2) 
		{
			pro=pro*a;
			x++;
		}
		int y=pro;
		while(pro!=0)
		{
			m=pro%10;
			sum=sum+m;
			pro=pro/10;
		}
		if(sum==a) 
		System.out.println("evil");{
			
		}

	}

}
