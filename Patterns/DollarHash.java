package Patterns;

public class DollarHash {

	public static void main(String[] args) {
		for(int x=1;x<=4;x++)
		{
			for (int y=1;y<=9;y++)
			{
				if((x==1 && y==5)||(x==1 && y==9)||(x==2 && y==3)||(x==3 && y==7)||(x==4 && y==1))
				{
					System.out.print("#"+" ");
				}
					else
					{
						
						System.out.print("$"+" ");
				    }	
			}
			System.out.println(" ");
				
		}
	    
		

	}

}
