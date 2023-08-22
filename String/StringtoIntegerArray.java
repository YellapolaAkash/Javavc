package string_Chapter1;

import java.util.Arrays;
import java.lang.*;
public class StringtoIntegerArray {

	public static void main(String[] args) {
		String s="123 vishwa 632 kala 456 127";
		String a[]=s.split(" ");
		int b[]=new int[a.length];
		String temp="";
		for(int x=0;x<a.length;x++)
		{
			temp="";
			for(int y=0;y<a[x].length();y++)
			{
				if(a[x].charAt(y)>='0' && a[x].charAt(y)<='9')
				{
					temp=temp+a[x].charAt(y);
				
				}
				else
					temp="-1";
			}
		double	num=Double.parseDouble(temp);
			b[x]=(int) num;
		}
		System.out.println(Arrays.toString(b));

	}

}
