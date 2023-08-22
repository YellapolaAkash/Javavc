package string_Chapter1;

public class Duplicates_String 
{
public static void main(String[] args)
{
	String s=new String("Hello all Good Morning").toLowerCase();
	
	char a[]=s.toCharArray();
	boolean b[]=new boolean[a.length];
	int count=0;
	for(int x=0;x<a.length;x++)
	{
		if(a[x]==' ')
		{
			continue;
		}
		if(b[x]==true)
		{
			continue;
		}
		count=0;
		for(int y=x+1;y<a.length;y++)
		{
			if(a[x]==a[y])
			{
				count++;
				b[y]=true;
				
			}
		}
		if(count>0)
			System.out.println(a[x]);
		
	}
	
}
}

