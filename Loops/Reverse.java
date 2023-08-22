package loops;

public class Reverse {

	public static void main(String[] args) {
		int n=1234,rev=0,x=0;
        for (n=1234;n>0;n/=10)
        {
        	x=n%10;
        	rev=rev*10+x;
        }
        System.out.println(rev);
	}

}
