package Patterns;

public class reIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int r=3;
//		for(int x=1;x<=r;x++)
//		{
//			for(int sq=1;sq<x;sq++)
//				System.out.print("  ");
//			for(int y=r;y>=x;y--)
//				System.out.print("* ");
//			for(int z=r;z>x;z--)
//				System.out.print("* ");
//			System.out.println();
//		}
//		for(int z=2;z<r;z++)
//		{
//			for(int f=r;f>=z;f--)
//				System.out.print("  ");
//			for(int e=;e<=z;e++)
//				System.out.print("* ");
//			for(int w=1;w<z;w++)
//				System.out.print("* ");
//			System.out.println();
//		}
		
		int r=5;
		for(int x=1;x<=r;x++)
		{
			for(int s=r;s>x;s--)
				System.out.print("  ");
			for(int s=1;s<=x;s++)
			{
				if(s==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int z=1;z<x;z++)
			{
				if(x-z==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int q=1;q<r;q++)
		{
			for(int i=1;i<=q;i++)
				System.out.print("  ");
			for(int j=r-1;j>=q;j--)
			{
				if(j==r-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int k=r-1;k>q;k--)
			{
				if(k-q==1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();	
		}
		
		
	}
}