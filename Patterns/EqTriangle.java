package Patterns;

public class EqTriangle {

	public static void main(String[] args) {
		
				for(int x=1;x<=3;x++)
				{
					for(int y=2;y>=x;y--)
					{
						System.out.print(" ");
					}
					for(int z=1;z<=x;z++)
					{
						System.out.print("*"+ " ");
					}
				    System.out.println(" ");
				}
	}

}
