package ArrayChapter1;

public class Search {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,4,6,7},count=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==9)
			{
				count++;
				System.out.println("element found"+" "+x);
				
				
			}
		
		}
		if(count==0)
		{
			System.out.println("element  not found");
		}
		}
		
	

}
