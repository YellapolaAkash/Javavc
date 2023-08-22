package ArrayChapter1;

import java.util.Scanner;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int r=3,c=3,temp;
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
		System.out.println("Before Transpose");
		for(int x=0;x<r;x++)
		{
			for(int y=0;y<c;y++)
			{
				System.out.print(a[x][y]);
			}
			System.out.println(" ");
		}
		
		for(int x=0;x<r;x++)
		{
			for(int y=x;y<c;y++)
			{
				temp=a[x][y];
				a[x][y]=a[y][x];
				a[y][x]=temp;
			}	
		}
		System.out.println("After Transpose");
		for(int x=0;x<r;x++)
		{
			for(int y=0;y<c;y++)
			{
				System.out.print(a[x][y]);
			}
			System.out.println(" ");
		}

	}

}
