package string_Chapter1;

public class Capital_Small {

	public static void main(String[] args) {
		String s=new String("ShirlaVishwaChaithanya");
		int x,cap=0,small=0;
		for(x=0;x<s.length();x++)
		{
			if(s.charAt(x)>='A' && s.charAt(x)<='Z')
				cap++;
			else
				small++;
		}
		System.out.println(cap+" "+small);
}

}
