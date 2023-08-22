package loops;

public class Extractionadd {

	public static void main(String[] args) {
		int x=1754;int n=0;
		for(;x>0;x/=10) {
			n=x%10;
			if(n%2==0) {
				System.out.println(n+2);}
				else
					System.out.println(n+1);
			
			}
		}

	}


