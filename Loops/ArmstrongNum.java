package loops;

public class ArmstrongNum {

	public static void main(String[] args) {
//		int n=153,count=0,temp=n,sum=0,x=0,arm=n,k=0;
//		for(n=153;n>0;n/=10)
//		{
//			count++;
//		}
//		for(temp=153;temp>0;temp/=10)
//		{
//			x=temp%10;
//			k=(int)Math.pow(x, count);
//			sum=sum+k;
//		}
//		if(sum==arm)
//		{
//			System.out.println("Armstrong Num");
//		}
//		else
//		{
//			System.out.println("Not Armstrong");
//		}
		for(int x=1;x<=5;x++)
		{
			
			
			for(int sp=1;sp<x;sp++)
			{
				System.out.print("  ");
			}
			for(int y=x;y<=5;y++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
