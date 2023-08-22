package string_Chapter1;

public class Alternative_Reverse {
	public static void main(String[] args) {
		String s=new String("Hello all Good Morning");
		String a[]=s.split(" ");
		String b="";
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				for(int y=0;y<a[x].length();y++)
				{
					if(a[x].charAt(y)>='A' && a[x].charAt(y)<='Z')
					{
						System.out.print((char)(a[x].charAt(y)+32));
					}
					if(a[x].charAt(y)>='a' && a[x].charAt(y)<='z')
					{
						System.out.print((char)(a[x].charAt(y)-32));
					}
					
				}
				System.out.println();
				
			}
			else
			{
				b="";
				for(int y=a[x].length()-1;y>=0;y--)
				{
					b=b+a[x].charAt(y);
				}
				a[x]=b;
				System.out.println(a[x]);
			}
		}
		
	}

}
