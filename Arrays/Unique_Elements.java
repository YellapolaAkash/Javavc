package ArrayChapter1;

public class Unique_Elements {

	public static void main(String[] args) {
       int a[]=new int[] {1,1,2,2,3,4,4,2,5,1,5,7,6,1},count=0;
		
		for(int x=0;x<a.length;x++)
		{
			count=0;
			for(int y=0;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
				
				}		
			}
			  
			if(count==1)
			{
				System.out.println(a[x]);
			}
		}

	}

}
