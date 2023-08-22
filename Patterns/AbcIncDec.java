package Patterns;

public class AbcIncDec {

	public static void main(String[] args) {
//		for(int x=6;x>=1;x--)
//		{
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print((char)(y+64));
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//			    System.out.print((char)(j+64));	
//			}
//			System.out.println("");
//		}
		
		int r=4;
		for(int x=1;x<=r;x++)
		{
			for(int sp=1;sp<x;sp++) {
				System.out.print(" ");}
			for(int y=r;y>=x;y--) {
				System.out.print("*");}
			System.out.println();
		}
		for(int q=2;q<=r;q++)
		{
			for(int z=q;z<r;z++)
				System.out.print(" ");
			for(int e=1;e<=q;e++)
				System.out.print("*");
			System.out.println();
		}
	}

}
