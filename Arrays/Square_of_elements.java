package Arrays;

public class Square_of_elements {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4};
		int b[]=new int[4],j=0;
		for(int x=a.length-1;x>=0;x--)
		{
			b[j]=a[x]*a[x];
			j++;
		}
		for(int y=0;y<b.length;y++)
		{
			System.out.println(a[y]+"  " +b[y]);
		}
	}

}
