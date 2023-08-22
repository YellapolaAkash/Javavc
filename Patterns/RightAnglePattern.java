package Patterns;

public class RightAnglePattern 
{

	public static void main(String[] args) 
	{
		Right obj=new Right();
		for(int x=1;x<=5;x++)
		{
			obj.meth1(x);
		}
	}

}
class Right
{
	public void meth1(int x)
	{
		for(int y=1;y<=x;y++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
}