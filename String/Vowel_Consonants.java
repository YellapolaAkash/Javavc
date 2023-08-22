package string_Chapter1;

public class Vowel_Consonants {

	public static void main(String[] args) {
	String s=new String("Sarileru Nikevvaru");
	int capV=0,smallV=0,cons=0;
	for(int x=0;x<s.length();x++)
	{
		if(s.charAt(x)=='A' || s.charAt(x)=='E' || s.charAt(x)=='I' || s.charAt(x)=='O' || s.charAt(x)=='U')
		{
			capV++;
		}
		else if(s.charAt(x)=='a' || s.charAt(x)=='e' || s.charAt(x)=='i' || s.charAt(x)=='o' || s.charAt(x)=='u')
		{
			smallV++;
		}
		else
		{
			cons++;
		}
	}
	System.out.print("vowels are :"+(capV+smallV)+ " "+"Consonents are :"+cons);
	}

}
