package string_Chapter1;

public class Second_Largest_Word {

	public static void main(String[] args) {
		String s=new String("Hereeeeee isssssssssss my day");
		String []a=s.split(" ");
		int f=0;
		int   se=1;
		for(int x=0;x<a.length;x++)
		{
			if(a[f].length()<a[x].length())
			{
				se=f;
				f=x;
				
			}
			
			else if((a[f].length()>a[x].length())&&( a[x].length()>a[se].length()))
			{
				se=x;
				
			}
		}
		System.out.println("second largest string : "+a[se]+","+"Length is: "+a[se].length());
		
		
		
		
	}

}
