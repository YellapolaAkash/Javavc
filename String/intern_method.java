package string_Chapter1;

public class intern_method {

	public static void main(String[] args) {
		String s=new String("hello").intern();
		String s1="hello";
		if(s1==s)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
