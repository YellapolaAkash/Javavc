package string_Chapter1;

public class Deleting_Duplicate_words {

	public static void main(String[] args) {
		String s=new String ("Hello im vishwa hello hello hi hi");
		String a[]=s.split(" ");int count=0;
		for(int x=0;x<a.length;x++)
		{
			count=0;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x].compareToIgnoreCase(a[y])==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(a[x]);
			}
		}

	}

}
