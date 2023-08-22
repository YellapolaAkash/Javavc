package string_Chapter1;

import java.util.Arrays;

public class Largest_word_in_a_String {

	public static void main(String[] args) 
	{
		String s=new String("   I         can do the     all daay     ");
		String a[]=s.split(" ");
		int b=0; String ab="";
		for(String temp:a)
		{
	     	if(temp.length()>b)
	     	{
	     		b=temp.length();
	     		ab=temp;
	     	}
	     	
	   	}
	
		
		System.out.println(b);
		System.out.println(ab);
		
	/* int max=a[0].length();
	 	for(int x=0;x<a.length-1;x++)
		{
			if(a[max].length()<a[x+1].length())
			{
				max=x+1;
			}
		}
		System.out.println(a[max]+ " "+ a[max].length());
		*/
		
	}

	}
