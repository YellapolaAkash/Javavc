package NestedLoops;
import java.util.Scanner;
public class PowerRange {

	public static void main(String[] args) {
		int z=0,sum=0,pro=1,k,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int x=sc.nextInt();
		System.out.println("enter the second number");
		int y=sc.nextInt(); 
		for(;x<=y;x++) 
		{                                 //123>1+2+3=6>1*2*3=6
			sum=0;
			pro=1;
		for(k=x;k>0;k/=10)
		{
			
			m=k%10;
			sum=sum+m;
			pro=pro*m;
		}
		if(sum==pro)
		{
			System.out.println("Power numbers are:" +x);
		}
	    } 
		}

}
