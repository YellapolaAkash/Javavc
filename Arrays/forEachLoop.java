package ArrayChapter1;

import java.util.Scanner;

public class forEachLoop {

	public static void main(String[] args) {
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array elements");
	for(int x=0;x<a.length;x++)
	{
		a[x]=sc.nextInt();
	}
	Foreach ob=new Foreach();
	int res=ob.meth1(a);
	System.out.println("array length: "+res);
	sc.close();
	}

}
class Foreach
{
	int count=0;
	
	public int meth1(int a[])
	{
	for(int temp:a)
	{
		count++;
		
	}
	return count;
	}
}
