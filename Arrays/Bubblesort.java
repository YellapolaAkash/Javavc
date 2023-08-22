package ArrayChapter1;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]=new int[] {3,1,2,5},temp;
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a.length-1;y++)
			{
				if(a[y]>a[y+1])
				{
					temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
					
				}
			}
		}
		for(int var:a)
		{
			System.out.println(var);
		}

	}

}
