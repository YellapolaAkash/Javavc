package string_Chapter1;

public class First_Last_index_UpperCase {

	public static void main(String[] args) {
		String s=new String("madam arora teaches malayalam");
		String a[]=s.split(" ");
		String i="";
		String i1="";
		for(int x=0;x<a.length;x++)
		{
			i="";i1="";         
			    
			for(int y=0;y<a[x].length();y++)
			{
				if(y==a[x].length()-1)
				{
					i1=i1+a[x].charAt(y);
					
					i1=i1.toUpperCase();
				}
				else if(y==0)
				{
					i=i+a[x].charAt(y);
					
					i=i.toUpperCase();
					
				}
				else
					i=i+a[x].charAt(y);
			}
			i=i+i1;
			a[x]=i;
			System.out.println(a[x]);
			
		}

	}

}
