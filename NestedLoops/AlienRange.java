package NestedLoops;
import java.util.Scanner;
public class AlienRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
		int x=0,y=0,rev=0,z=0,a=0,rev1=0;
		for(;n1<=n2;n1++)
		{
		x=0;                              // example 12*12 =144 ,rev of 144=441, rev of 12 =21,21*21=441
		x=n1*n1;          
		rev=0;
		for(int m=n1;m>0;m/=10)
		{
			y=m%10;
			rev=rev*10+y;   
		}
		z=rev*rev;         
		rev1=0;
		for(;x>0;x/=10)
		{
			a=x%10;
			rev1=rev1*10+a;      
		}
		if(rev1==z) 
		{
			System.out.println(n1);
		}
		
	    }
	}
	

}
