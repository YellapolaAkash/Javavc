package ArrayChapter1;
import java.util.Random;
public class Left_Rotation_m2 {

	public static void main(String[] args) 
	{
		Random r=new Random();
		int a[]=new int[5];
		System.out.println("Generated Elements are:");
		for(int x=0;x<a.length;x++)
		{
			a[x]=r.nextInt(10);
		}
		
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]+" ");
		}
		System.out.println();
		Left ob=new Left();
		System.out.println("After left rotation: ");
		ob.meth1(a);
	}

}
class Left
{
	public void meth1(int a[])
	{
		//int temp=a[0];
		int temp,x,n=4;
		for(int z=1;z<=n;z++)
		{
		temp=a[0];
		for(x=0;x<a.length-1;x++)
		{
			a[x]=a[x+1];
			
		}
		a[x]=temp;
	//	temp=a[0];
		}
		for(int y=0;y<a.length;y++)
		{
			System.out.print(a[y]+" ");
			
		}
		System.out.println();
	

	}
	
}
