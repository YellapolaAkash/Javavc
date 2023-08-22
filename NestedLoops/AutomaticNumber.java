package NestedLoops;

import java.util.Scanner;

public class AutomaticNumber {

	public static void main(String[] args) {
		int x=0,y=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");           // 76  >76*76=57(76)
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
		for(;n1<=n2;n1++)
		{
		x=0;
		x=n1*n1;
		y=x%100;
		if(y==n1)
		System.out.println(n1);
	    }

	}

}
