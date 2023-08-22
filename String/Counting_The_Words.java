package string_Chapter1;

public class Counting_The_Words {

	public static void main(String[] args) {
		String s=new String("Sarakaru Vaari Paata");
		int space=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)==' ')
			{
				space++;
			}
		}
		System.out.println("Number of words are:"+(space+1));
	}

}
