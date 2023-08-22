package Patterns;

public class Jsp {

	public static void main(String[] args) {
		String s1=new String("hello all good morning");
		String s[]=s1.split(" ");
	for(int x0=0;x0<s.length;x0++)
	{
		boolean b[]=new boolean[s[x0].length()];

	for(int x=0;x<s[x0].length();x++)
	{
		
		if(b[x]==true)
		{
			continue;
		}
		for(int y=x+1;y<s[x0].length();y++)
		{
			if(s[x0].charAt(x)==s[x0].charAt(y))
			b[y]=true;
		}
		if(x==0)
		{
			System.out.print((char)(s[x0].charAt(x)-32));
		}
		else
		{
		System.out.print(s[x0].charAt(x));
	}
		
	}System.out.print(" ");	
	}	

	}

}
