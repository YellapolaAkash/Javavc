package string_Chapter1;

public class Alphabets_String {

	public static void main(String[] args) {
	String s= new String("qwertyuiopasdfghjklmnbvcxz");
	char a[]=s.toCharArray();
	int count=0,count1=0;
	for(int x=0;x<a.length;x++)
	{
		count=0;
		if(a[x]==' ')
		{
			continue;
		}
		
		for(int y=x+1;y<a.length;y++)
		{
			if(a[x]==a[y])
			{
			count++;
			
			}
		}
		if(count==0)
		{
			count1++;
		}
	}
	if(count1==26)
	{
		System.out.println("Lappy");
	}
	
	
	}

}
