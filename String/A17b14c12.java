package string_Chapter1;

public class A17b14c12 {

	public static void main(String[] args) {
		String s=new String("a17b12c14");int num=0,num2=0;
		for(int x=0;x<s.length();x++)
		{num=0;num2=0;
			if(s.charAt(x)>='a' && s.charAt(x)<='z')
			{
				if(s.charAt(x+1)>='0' && s.charAt(x+1)<='9' && s.charAt(x+2)>='0' && s.charAt(x+2)<='9')
				{
					 num=Character.getNumericValue(s.charAt(x+1))*10;
					 
					 num2=Character.getNumericValue(s.charAt(x+2));
					 num=num+num2; 
 
				}
				for(int y=0;y<num;y++)
				{
					System.out.println(s.charAt(x));
				}
				
			}
			
		}

	}

}
