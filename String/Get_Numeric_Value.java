package string_Chapter1;
public class Get_Numeric_Value {
	public static void main(String[] args) {
		String s="d2a2b3c5p4";int num=0;
		for(int x=0;x<s.length()-1;x++)
		{
			if(s.charAt(x)>='A' && s.charAt(x)<='Z' || s.charAt(x)>='a' && s.charAt(x)<='z')
			{
				if(s.charAt(x+1)>='0' && s.charAt(x+1)<='9')
				{
					 num=Character.getNumericValue(s.charAt(x+1));	
				}
				for(int y=0;y<num;y++)
				{
					System.out.print(s.charAt(x));
				}
				System.out.print(" ");
			}
		}

	}
}

