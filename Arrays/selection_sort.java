package ArrayChapter1;

public class selection_sort {

	public static void main(String[] args) 
	{
		int a[]=new int[] {9,8,5,4,7,2},i,temp;
		for(int x=0;x<a.length;x++ )
		{
			i=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[i]>a[y])
				{
					i=y;
				}
			}
			temp=a[i];
			a[i]=a[x];
			a[x]=temp;
		}
		for(int var:a)
		{
			System.out.println(var);
		}
		
	}

}
