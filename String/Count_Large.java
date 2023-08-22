package string_Chapter1;

public class Count_Large {

	public static void main(String[] args) {
		String s=new String("Trying to muchhhhhhhhhhhh betterrrrr").toLowerCase();
		int i=0,x1=0,count=0,count2=0;
		String a[]=s.split(" ");
		int b=0;
		String c="";
		for(String temp:a)
		{
			if(temp.length()>b)
			{
				b=temp.length();
				c=temp;
			}
		}
		System.out.println(b+" "+c);
		for(String var:a)
		{
			if(var.isEmpty())
			{
				continue;
			}
			else
			{
				count2++;
			}
		}
		System.out.println(count2);

		
		
		
		
	for(int x=0;x<s.length();x++)
	{
		//x=x1;
		if(s.charAt(x)>='a' && s.charAt(x)<='z')
		{
			count++;
		}
		else if(s.charAt(x)==' ' && s.charAt(x)==s.charAt(x-1))
		{
		
			if(i<count)
			{
				i=count;
				System.out.println(count);
			}
			count=0;
			
			
		}
		else 
		{
			if(i<count)
			{
				i=count;
				System.out.println(count);
			}
			count=0;
			
			
		}

	}
	System.out.println(i);
	}
	
		
	

}
