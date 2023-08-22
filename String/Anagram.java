package string_Chapter1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s=new String ("Listen").toLowerCase();
		String s1=new String ("silent").toLowerCase();
		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();
		int count=0;
		if(s.length()==s1.length())
		{
			Arrays.sort(a);
			Arrays.sort(b);
			for(int x=0;x<a.length;x++)
			{
			  for(int y=0;y<b.length;y++)
			  {
				  if(a[x]==b[y])
				  {
					  count++;
//					  break;
				  }
			  }
			}
		}
		if(count==a.length)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not");
		}
	}

}
