package loops;

public class LappyNum
{

	public static void main(String[] args) 
	{
		int n=192,x=1,i=1,sum=0,p,rem,y=0,count=0;//192384576
		while(x<=3)
		{
			p=n*x;
			sum=sum*1000+p;
			x++;
		}
		System.out.println(sum);
		for(int z=1;z<=9;z++)
		{
		count=sum;
		rem=0;
		for(;count>0;count/=10)
		{
			rem=count%10;
		    while(rem==i)
		    {
		    	i++;
		    	break;
		    }
		}
		}
		if(i==10)
		{
			System.out.println("Lappy num");
		}
		else
		{
			System.out.println("not ");
		}		
	}

}
