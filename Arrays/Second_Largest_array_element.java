package ArrayChapter1;

public class Second_Largest_array_element {

	public static void main(String[] args) {
		int arr[]=new int[] {50,40,30,20,10};
		int max=0;
		int f=max;
		int se=01;
		for(int x=0;x<arr.length;x++)
		{
			if(arr[max]<arr[x])
			{
				se=max;
				max=x;
				
			}
			else  if(arr[max]>arr[x] && arr[x]>arr[se])
			{
				se=x;
			}
		}
		System.out.println("highest element: "+arr[f]);
		System.out.println("Second highest: "+arr[se]);
		
				
		
	}

}
