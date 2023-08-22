 package string_Chapter1;

import java.util.Arrays;

public class CompareTo_Dictionary 
{
	public static void main(String[] args) 
	{
		String s=new String ("hello welcome to all my world");
		String a[]=s.split(" ");
		String temp="";
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1;y++)
			{
				int z=(a[y].compareToIgnoreCase(a[y+1]));
				if(z>0)
				{
					temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}	
			}
		}
		for(String var:a)
		{
			System.out.println(var);
		}
	}

}
