package NestedLoops;

public class Reverse2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=15200;
		int k=(int)Math.log10(n);
		int c=0;
		while(c<=k)
		{ 
			int coe=n/(int)Math.pow(10,k);
			System.out.println(n%(int)Math.pow(10,k)*coe);//
			n=n-(int)Math.pow(10,k)*coe;
			c++;
			k--;
		}

	}

}
