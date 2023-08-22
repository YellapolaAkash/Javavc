package string_Chapter1;

import java.util.Scanner;

public class Vowel_aside_consonants_aside {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
	    s=sc.nextLine();
	    String s1=new String();
	    for(int x=0;x<s.length();x++)
	    {
	    	if(s.charAt(x)=='A' || s.charAt(x)=='E' || s.charAt(x)=='I' || s.charAt(x)=='O' || s.charAt(x)=='U')
	    	{
	    		s1=s1+s.charAt(x);
	    	}
	    	else if(s.charAt(x)=='a' || s.charAt(x)=='e' || s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u')
	    	{
	    		s1=s1+s.charAt(x);
	    	}
	    }
	    for(int x=0;x<s.length();x++)
	    {
	    	if(s.charAt(x)!='A' && s.charAt(x)!='E' && s.charAt(x)!='I' && s.charAt(x)!='O' && s.charAt(x)!='U' && s.charAt(x)!='a' && s.charAt(x)!='e' && s.charAt(x)!='i' && s.charAt(x)!='o' && s.charAt(x)!='u')
	    	{
	    		s1=s1+s.charAt(x);
	    	}
	    	
	    }
	    System.out.println(s1);
		
	}
}
