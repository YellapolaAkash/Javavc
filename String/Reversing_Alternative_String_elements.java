package string_Chapter1;

public class Reversing_Alternative_String_elements
{
public static void main(String[] args) 
{
	String s=new String ("hello welcome to my world");
	String a[]=s.split(" ");
	String i="";
	for(int x=0;x<a.length;x+=2)
	{
		i="";
		for(int y=a[x].length()-1;y>=0;y--)
		{
			i=i+a[x].charAt(y);
	    }
		a[x]=i;
	}
	for(String temp:a)
	{
		System.out.println(temp);
	}
	
}
}

