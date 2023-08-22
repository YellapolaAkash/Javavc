package loops;

public class LargestdigitofaNum {

	public static void main(String[] args) {
		int n=64587549;int x=0;int y=0;
		for(;n>0;n/=10 )
		{
		    x=n%10;
			if(x>y)
			{
				y=x;
			}
				
		}
		System.out.println(y);
	
		
		
		
/*for(;n>0;n/=10) {
			
			x=n%10;
			if(x<y) {
				y=x;
			}
			
		}
		System.out.println(y); */

}

}

