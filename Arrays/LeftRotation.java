package ArrayChapter1;

public class LeftRotation {

	public static void main(String[] args) 
	{
	  int a[]=new int[] {1,2,3,4,5,6,7,8};
	  int r=6;
	  for(int x=r;x<a.length;x++)
	  {
		  System.out.println(a[x]);
	  }
	  for(int x=0;x<r;x++)
	  {
		  System.out.println(a[x]);
	  }
	}

}
