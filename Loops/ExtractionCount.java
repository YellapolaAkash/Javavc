package loops;

public class ExtractionCount {

	public static void main(String[] args)
	{
		int z=10256;int count=0;int x=0;int sum=0;int pro=1;
		for(;z>0;z/=10)
		{
			count++;
			x=z%10;
			sum=sum+x;
			pro=pro*x;	
		}
	    if(count%2==0)
     	{
		System.out.println(sum);
		
    	}
	    else
		System.out.println(pro);
	}
}
