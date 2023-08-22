package string_Chapter1;

public class To_String_method {

	public static void main(String[] args)
	{
		String s=new String("hello");
		StringBuffer b=new StringBuffer(s);
		String s1=b.toString();
		System.out.println(s1);
	}

}
