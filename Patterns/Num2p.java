package Patterns;

public class Num2p {

	public static void main(String[] args) {
		int sum=0;
	 for (int x=1;x<=4;x++)
	 {
		 for(int y=1;y<=x;y++)
		 {
			 System.out.print(y);
		 }
		 
		 for(int j=x;j>1;j--)//j>0
		 {
			// if(j==1)
		//	 System.out.print("");
			// else
				 System.out.print(j-1);
		 }
		 System.out.println(" ");
	 }

	 }
	}

	


