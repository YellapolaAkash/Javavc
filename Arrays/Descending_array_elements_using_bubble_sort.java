package ArrayChapter1;

public class Descending_array_elements_using_bubble_sort {

	public static void main(String[] args)
	{
	int a[]=new int[] {1,2,3,4,5},temp;
	for(int x=0;x<a.length;x++)
	{
		for(int y=0;y<a.length-1;y++)
		{
			if(a[y]<a[y+1])
			{
				temp=a[y+1];//1
				a[y+1]=a[y];
				a[y]=temp;
				
			}
		}
		
	}
	for(int var:a)
	{
		System.out.println(var);
	}

	}

}
