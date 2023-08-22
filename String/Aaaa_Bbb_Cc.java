package string_Chapter1;

public class Aaaa_Bbb_Cc {

	public static void main(String[] args)
	{
	String s=new String("aaaabbccc");
	char []c=s.toCharArray();
	boolean b[]=new boolean[c.length];
	int count=0;
	String s1="";
	for(int x=0;x<c.length;x++)
	{
		if(b[x]==true)
		{
			continue;
		}
		count=0;
		for(int y=0;y<c.length;y++)
		{
			if(c[x]==c[y])
			{
				count++;
				
			    b[y]=true;
			}
		}
            s1=s1+c[x];
			s1=s1+count;
	}
	System.out.println(s1);

	}

}
