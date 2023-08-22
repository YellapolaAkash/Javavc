package loops;

public class Coprimes{
	public static void main(String[] args)
	{
		int n1=11,n2=17,x=1,y=1,count1=0,z=1,count=0,count3=0;
		while (x<=n1) 
		{
		  if(n1%x==0)
		  {
			  count++;
		  }
			x++;
		}
		if( count==2) 
		{
			System.out.println("n1 is prime :" +n1);
		}
		else 
		{
			System.out.println("not prime:"+n1);
		}
		while (y<=n2) 
		{
		  if(n2%y==0)
		  {
			  count1++;
		  }
			y++;
		}
		if( count1==2) 
		{
			System.out.println("n2 is prime :" +n2);
		}
		else
		{
			System.out.println("not prime:"+n2);
		}
		count3=n2-n1;
		if(count3==2 || count3==(-2)) {
			System.out.println("coprimes");
		}
		else {
			System.out.println("not coprimes");
		}
	
}
}
                                                                                                                                                                                                                                                                                                                                                           
