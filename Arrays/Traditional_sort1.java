package ArrayChapter1;

public class Traditional_sort1 {

	public static void main(String[] args) 
	{
		int a[]=new int[] {9,8,5,4},temp;
		for(int x=0;x<a.length-1;x++)
		{
			if(a[x]>a[x+1])
			{
				temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
		}
		for(int var:a)
		{
			System.out.println(var);
		}
	
	}

}
