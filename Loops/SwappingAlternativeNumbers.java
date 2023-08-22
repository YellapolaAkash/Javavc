package loops;

public class SwappingAlternativeNumbers {

	public static void main(String[] args) {
		int n=784500,rev=0,x,y,z,k,a,m=1,count=0,count1=0,count2=0;
		for (n=784500;n>0;n/=10)
		{   count1++;
			x=n%10;
			rev=rev*10+x;//855005	
		}
		for(;rev>0;rev/=100)
		{
			z=rev%100;
			count2++;
		
			a=z/10;
			k=z%10;
			
			System.out.print(a);
			System.out.print(k);
		}
		count=count1-count2*2;
		for(m=1;m<=count;m++)
		{
			System.out.print(0);
		}

	}

}
