package Patterns;

public class AbcPattern {

	public static void main(String[] args) {
		int z=0;
		for(int x=1;x<=6;x++)
		{
			for(int y=1;y<=x;y++)
			{
				z=z+1;
				System.out.print((char)(z+64)+" ");
			
			}
			System.out.println(" ");
		}
	}

}
