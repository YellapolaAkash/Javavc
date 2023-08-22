package ArrayChapter1;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,60,40,70,80};
		Arrays.sort(a);
		int low=0,high=a.length-1,mid,search=70,count=0;
		//for(int x=0;x<a.length;x++)
		//{
	//		System.out.println(a[x]);
	//	}
		
		for(;low<=high;)
		{
			
			mid=(low+high)/2;
			if(a[mid]<search)
			{
				low=mid+1;
			}
			else if(a[mid]>search)
			{
				high=mid-1;
			}
			else
			{
				
				System.out.println("Element found" );
			 break;
			}
			
			
		}
		if(low>high)
		{
			System.out.println("element not found");
		}
		System.out.println(count);

	}
	
}
