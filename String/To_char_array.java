package string_Chapter1;

public class To_char_array {

	public static void main(String[] args)
	{
        String s=new String("Hello all good morning");
        char []a=s.toCharArray();//conversion of string into char array
        for(char var :a )
        {
        	System.out.print(var+" ");
        }
	}

}
