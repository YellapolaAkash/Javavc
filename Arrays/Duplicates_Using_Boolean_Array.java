package ArrayChapter1;

public class Duplicates_Using_Boolean_Array {

	public static void main(String[] args) {
		int a[]=new int[] {2,21,3,44,1,3,2,5,3},count=0;
		boolean b[] =new boolean [a.length];
		for(int x=0;x<a.length;x++)
		{
			if(b[x]==true)
			{
				continue;
			}
			count=0;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count==0)
			{
				System.out.println(a[x]);
			}
		}
		
	}

}
