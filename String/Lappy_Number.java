package string_Chapter1;

public class Lappy_Number {

	public static void main(String[] args)
	{
		int num=192,sum=0,count=0,i=0;;
		int x=1,p=0;
		String s="";
		while(x<=3)
		{
			p=num*x;
			sum=sum*1000+p;
			x++;
		}
		s=s+sum;
		
		char a[]=s.toCharArray();
		for(x=0;x<a.length;x++)
		{
			count=0;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]==a[y])
				{
					count++;
				}
			}	
				if(count==0)
				{
					i++;
				}
			
		}
		if(i==9)
		{
			System.out.println("Lappy");
		}
	}

}
