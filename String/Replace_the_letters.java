package string_Chapter1;

public class Replace_the_letters {

	public static void main(String[] args) {
		String s=new String("gUNTURU kAARAM hIGHLY iNFLAMMABLE");
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='A' && s.charAt(x)<='Z')
			{
				System.out.print((char)(s.charAt(x)+32));
			}
			else if(s.charAt(x)>='a' && s.charAt(x)<='z')
			{
				System.out.print((char)(s.charAt(x)-32));
			}
			else
			{
				System.out.print(" ");
			}
		}

	}

}
