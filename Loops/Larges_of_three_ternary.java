package loops;
import java.util.*;
public class Larges_of_three_ternary {

	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4};
		int b[]=new int[] {5,6,7,8};
		int c[]=new int[a.length+b.length];
		int i=0;
		for(int x=0;x<c.length;x++)
		{
			if(x<a.length)
			{
				c[i]=a[x];
				i++;
			}
			if(x<b.length)
			{
				c[i]=b[x];
				i++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
