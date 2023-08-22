package ArrayChapter1;
import java.util.Scanner;
public class Two_D_Array {

	public static void main(String[] args) {
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
		for(int x=0;x<r;x++)
		{
			for(int y=0;y<c;y++)
			{
			System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		

	}

}
