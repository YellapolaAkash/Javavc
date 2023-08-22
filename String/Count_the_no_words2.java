package string_Chapter1;

public class Count_the_no_words2 {

	public static void main(String[] args) {
		String s=new String("hello all     good morning");
		String s1=new String();
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			if(s.charAt(x)==' ') 
			{
				if(s.charAt(x-1)==' ')
				{
					continue;
				}
				else
					count++;	
			}
		}
		System.out.println(count+1);
	}

}
