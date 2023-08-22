package string_Chapter1;

public class String_Palindrome {

	public static void main(String[] args) {
		String s=new String("Madam Arora Teaches Malayalam");
		String a[]=s.split(" ");
		String i="";int count=0;
		for(int x=0;x<a.length;x++)
		{
			i="";
			for(int y=a[x].length()-1;y>=0;y--)
			{
				i=i+a[x].charAt(y);
			}
			
			if(i.equalsIgnoreCase(a[x]))
            {
				count++;
	            System.out.println(a[x]);
            }
		}
		System.out.println(count);

	}

}
