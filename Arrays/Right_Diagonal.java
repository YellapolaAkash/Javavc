package ArrayChapter1;

import java.util.Scanner;

public class Right_Diagonal {

	public static void main(String[] args)
	{
		int r=3,c=3;
		int a[][]=new int[r][c];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements");
		for(int x=0;x<r;x++)
		{
			for(int y=0;y<c;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		for(int x=0;x<r;x++)             //for(int x=0,y=col-1;x<r;x++,y--)   
		{                                //   {
			for(int y=0;y<c;y++)         //      System.out.println(a[x][y]);
			{                            //   }
				if(x+y==r-1)
				{
			     System.out.print(a[x][y]+" ");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println("");
			
		}

	}

}
