package loops;

public class PrintingEvenofaNumber
{

	public static void main(String[] args)
	{
		//int n=1745;
		//for(n=1745;n>0;n/=10)
		int n=1234;int sum=0;int x=0;
		for(n=1234;n>0;n/=10)
		{
		x=n%10;
		if(x%2==0)
		{
			System.out.println(x);
		}
		}
	}
}
