package loops;

public class TechnologyNum {

	public static void main(String[] args) {
		int n=9801,count=0,x=1,p=1,num1=0,num2=0,num=0,temp=n;
		for (;n>0;n/=10)
		{
			count++;
		}
		count=count/2;
		for(x=1;x<=count;x++)
		{
			p=p*10;
		}
		n=temp;
		num1=n%p;
		num2=n/p;
		num=num1+num2;
		num=num*num;
		if(num==n)
		{
			System.out.println("technology number");
		}
		else 
		{
			System.out.println("Not a Tech num");
		}
		

	}

}
