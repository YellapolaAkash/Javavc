package ArrayChapter1;
import java.util.Random;
public class Prime {

	public static void main(String[] args)
	{
		Random r=new Random();
		isprime obj=new isprime();
		int  a[]=new int[6];
		System.out.println("Array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=r.nextInt(10);
		}
		for(int x=0;x<a.length;x++)
		{
		  System.out.println(a[x]);
		}
		for(int x=0;x<a.length;x++)
		{
		  obj.meth1(a[x]);
		}
	}
}
class isprime
{
	public void meth1(int a)
	{
		int count=0,y;
		for( y=1;y<=a;y++)
		{
			if(a%y==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("    "+a);
			}
		
	}
	
}

