package string_Chapter1;

public class Unique_String {

	public static void main(String[] args) {
		String s=new String("hello chey hello hi");
		String a[]=s.split(" ");int count=1;
		boolean b[]=new boolean[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x]==true)
			{
				continue;
			}
			if(a[x]==" ")
			{
		       continue;
			}
			count=1;
			for(int y=x+1;y<a.length;y++)
			{
			if(a[x].compareToIgnoreCase(a[y])==0)
			{
				count++;
				b[y]=true;
			}
			}
			if(count>0)
			{
				System.out.println(a[x]);
			}
			
		}
		
	}

}
