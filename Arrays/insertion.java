package ArrayChapter1;

public class insertion {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,40,50,60};//inserting a value in the index 3
		int element=35,x;
		for(x=a.length-1;x>4;x--)
		{
			a[x]=a[x-1];
		}
		a[x]=element;
		for(int var: a)
		{
			System.out.println(var);
		}
		
			
		
	}

}
