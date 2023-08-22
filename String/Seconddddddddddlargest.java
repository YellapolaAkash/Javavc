package string_Chapter1;

public class Seconddddddddddlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("my name is vishwachaithanya hello fuyfjhmvhjmvujcvjytt");
		String a[]=s.split(" ");
		int low1=Integer.MIN_VALUE;
		int low2=Integer.MIN_VALUE;
		for(String temp:a)
		{
			if(temp.length()>low1)
			{
				low2=low1;
				low1=temp.length();
				
			}
			else if(temp.length()>low2)
			{
				low2=temp.length();
			}
		}
		System.out.println(low1);
		System.out.println(low2);
	}

}
