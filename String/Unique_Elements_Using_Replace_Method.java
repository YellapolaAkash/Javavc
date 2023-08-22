package string_Chapter1;

public class Unique_Elements_Using_Replace_Method {

	public static void main(String[] args)
	{
		String s=new String("This is Vishwachaithanya").toLowerCase();
		StringBuffer sb =new StringBuffer(s);
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<s.length();y++)
			{
				if(sb.charAt(x)==sb.charAt(y))
				{
					sb.replace(y, y+1, "*");
				}
			}
		}
		for(int x=0;x<sb.length();x++)
		{
			if(sb.charAt(x)=='*' || sb.charAt(x)==' ')
			{
				continue;
			}
			System.out.println(sb.charAt(x));
		}

	}

}
