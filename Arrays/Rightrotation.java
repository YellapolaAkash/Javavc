package ArrayChapter1;

public class Rightrotation {

	public static void main(String[] args) 
	{
     int a[]=new int[] {1,2,3,4,5,6,7,8};
     right ob=new right();
     ob.meth1(a);
     ob.meth2(a);
	}
}
class right
{
	int r=6;
	public void meth1(int a[])
	{
		for(int x=a.length-r;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
	}
	public void meth2(int a[])
	{
		for(int x=0;x<a.length-r;x++)
		{
			System.out.println(a[x]);
		}
	}
}