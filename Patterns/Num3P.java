package Patterns;

public class Num3P {

	public static void main(String[] args)
	{
		for(int x=1;x<=4;x++)
		{
			for(int sp=3;sp>=x;sp--)
			{
				System.out.print(" ");
			}
			for(int y=x;y>0;y--)
			{
				System.out.print(y);
			}
			for(int z=2;z<=x;z++)
			{
				System.out.print(z);
			}
			System.out.println();
		}
		for(int i=3;i>=1;i--)
		{
			for(int sp2=3;sp2>=i;sp2--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	

	}

}
