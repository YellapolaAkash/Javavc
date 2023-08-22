package ArrayChapter1; 
public class Descending_Array_using_selectionsort {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5},i=0,temp;
		for(int x=0;x<a.length;x++)
		{
			i=x;
			
			for(int y=x+1;y<a.length;y++)
			{
				if(a[i]<a[y])
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
