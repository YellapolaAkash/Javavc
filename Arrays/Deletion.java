package ArrayChapter1;

public class Deletion {

	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30,40,50,60,70};
		for(int x=2;x<a.length-1;x++)
		{
			a[x]=a[x+1];
		}
		for(int var:a)
		{
			System.out.print(var+" ");
		}
	}

}
