package string_Chapter1;

public class Storing_the_reverse_order {

	public static void main(String[] args) {
	String s=new String("Hello world");
	String s1=new String();
	int y=0;
	for(int x=s.length()-1;x>=0;x--)
	{
		s1=s1+s.charAt(x);
	}
	System.out.println(s1);
	}

}
