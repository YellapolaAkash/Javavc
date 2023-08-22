package loops;

public class SecondLargestDigit {
  public static void main(String[] args){
     int n=5684;int x=0;int y=0;int z=0;int temp=n;int k=0;
		for(n=5684;n>0;n/=10 )
		{
		    x=n%10;
			if(x>y)
			{
				y=x;
			}	
}	
		for(;temp>0;temp/=10) 
		{
			z=temp%10;
			if(z<y)
			{
				if(z>k)
				{	
					k=z;
				}
			}	
		}
		System.out.println(k);
	
	}
}
