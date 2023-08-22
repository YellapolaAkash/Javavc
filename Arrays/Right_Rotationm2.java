package ArrayChapter1;

import java.util.Random;

public class Right_Rotationm2
{
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
		right1 ob=new right1();
		System.out.println("After right rotation: ");
		ob.meth1(a);
	}

}
class right1
{
	public void meth1(int a[])
	{
		
		int x;
		for(int z=1;z<=4;z++)
        {
		int temp=a[a.length-1];
		for(x=a.length-1;x>0;x--)
		{
			a[x]=a[x-1];
			
		}
		a[0]=temp;
	
        }
  		for(int y=0;y<a.length;y++)
		{
			System.out.print(a[y]+" ");
			
		}
		System.out.println();
	

}
	
}

