package ArrayChapter1;

public class Frequency_Elements {

		public static void main(String[] args) {
			int a[]=new int[] {2,21,3,44,1,3,2,5,3},count=1;
			boolean b[] =new boolean [a.length];
			for(int x=0;x<a.length;x++)
			{
				if(b[x]==true)
				{
					continue;
				}
				count=1;
				for(int y=x+1;y<a.length;y++)
				{
					if(a[x]==a[y])
					{
						count++;
						b[y]=true;
					}
				}
			//	if(count==1)
				{
					System.out.println("count   "+a[x]+"--->"+count);
				}
			}
	}

}
