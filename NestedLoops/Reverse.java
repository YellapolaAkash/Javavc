package NestedLoops;
import java.util.*;
public class Reverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=15200;
		int k=(int)Math.log10(n);
		System.out.println((int)Math.pow(10,k));
		int sum=0;
		while(k>=0)
		{
			int coe=n/(int)Math.pow(10,k);
			System.out.println(coe);
			n=n-(int)Math.pow(10,k)*coe;
			k--;
		}
	

	}

}
