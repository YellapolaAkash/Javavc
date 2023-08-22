package ArrayChapter1;

public class Linearsearch_insertion {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,6,4
				},count=0,y;
		int b[]=new int [a.length+1];
	
		int flag=5;
		for(int x=0;x<b.length-1;x++)
		{
			b[x]=a[x];
		}
		for(int x=0;x<b.length;x++)
		{
			if(b[x]==flag)
			{
				count++;
				System.out.println("Element found"+" "+x);
			}
			
		}
		
		if(count==0)
		{
			System.out.println(" Element  not found");
			for( y=b.length-1;y>b.length/2;y--)
			{
				b[y]=b[y-1];
			}
			b[y]=flag;
			
		
		for(int x=0;x<b.length;x++)
		{
			System.out.println(b[x]);
		}
		}	
	}

}
