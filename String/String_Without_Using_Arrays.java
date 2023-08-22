package string_Chapter1;

public class String_Without_Using_Arrays {

	public static void main(String[] args) {
		String s= new String ("Apple");
		String s1="";
		for(int x=65;x<=122;x++)
		{
			for(int y=0;y<s.length();y++)
			{
				if((char)x==s.charAt(y))
				s1=s1+s.charAt(y);
			}
		}
		System.out.println(s1);
	}

}
