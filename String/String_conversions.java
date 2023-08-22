package string_Chapter1;

public class String_conversions {
//Integer.parseInt
	public static void main(String[] args) {
	/*	String s="123";
		int num=Integer.parseInt(s);
		System.out.println(num);
		*/
		//Character.getNumericValue
		String s=("a1b2c3");
		int sum=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='0' && s.charAt(x)<='9')
			{
				 sum=sum+Character.getNumericValue(s.charAt(x));
			}
		}
		System.out.println(sum);
	}

}
