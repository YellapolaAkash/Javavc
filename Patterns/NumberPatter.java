package Patterns;

public class NumberPatter {
	public static void main (String [] args) {
		int z=0;
		for(int x=1;x<=4;x++) 
		{
		for(int y=1;y<=x;y++)	
		{
			z=z+2;
			System.out.print(" "+ z +" ");
		}
		System.out.println(" ");
		}
	}

}
