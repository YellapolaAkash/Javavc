package ArrayChapter1;

public class Reverse_array_without_using_another_array {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5};
		int temp=0,y=a.length-1;
		for(int x=0;x<=a.length/2;x++)
		{
			temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			y--;
			
		} 
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}

}
