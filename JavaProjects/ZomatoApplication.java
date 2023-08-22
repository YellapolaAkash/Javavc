package Objects;
import java.util.Scanner;
public class ZomatoApplication
{
	
	int sum=0,sum1=0,res=0,Bill=0,res2=0,res3=0,res4=0,res5=0,sum5=0,sum3=0,sum2=0,sum4=0;
	void meth1()
	{
		System.out.println("---------------------------------");
	    System.out.println("|      --  TAKE AWAY MENU --    | ");
	    System.out.println("---------------------------------");
	    System.out.println("|      1)BIRYANI'S              |");
	    System.out.println("|      2)KEBABS                 |"); 
	    System.out.println("|      3)CURRIES                |");
	    System.out.println("|      4)STARTERS               |");
	    System.out.println("|      5)INDIAN BREADS          |");
	    System.out.println("---------------------------------");
	  
	}
	void meth2()
	{
		int a,b,c,d,e,f,h,x1,d1,a5,b5,a4,f3,e3,h3,a2,b2,b4,c2,d2,d21;
		while(true)
		{
		meth1();
		Scanner sc=new Scanner(System.in);
		System.out.println(" choose the option");
		int x=sc.nextInt();
		if(x==1)
		{
			res=0;
			System.out.println("``````````````````````````````````````");
			System.out.println("` 1)Chicken Biryani        -   Rs 210`");
			System.out.println("` 2)Mutton Biryani         -   Rs 250`");
			System.out.println("` 3)Chicken Family Pack    -   Rs 550`");
			System.out.println("` 4)Egg Biryani            -   Rs 120`");
			System.out.println("` 5)Veg Biryani            -   Rs 150`");
			System.out.println("``````````````````````````````````````");
			System.out.println(" Choose the option from(1-5)");
			int y=sc.nextInt();
			switch(y)
			{
			case 1:
				System.out.println("How Much Qty ?");
				int z=sc.nextInt();
				a=210;
				sum=sum+a*z;
				break;
			case 2:
				System.out.println("How Much Qty ?");
				int i=sc.nextInt();
				b=250;
				sum=sum+b*i;
				break;
			case 3:
				System.out.println("How Much Qty ?");
				int j=sc.nextInt();
				c=550;
				sum=sum+c*j;
				break;
			case 4:
				System.out.println("How Much Qty");
				int k=sc.nextInt();
				d=120;
				sum=sum+d*k;
				break;
			case 5:
				System.out.println("How Much Qty");
				int g1=sc.nextInt();
				d1=150;
				sum=sum+d1*g1;
				break;
			}
			res=res+sum;
			
		}
		else if(x==2)
		{
			res2=0;
			System.out.println("`````````````````````````````````````");
			System.out.println("`1)Chicken Tikka Kebab  -     Rs 210`");
			System.out.println("`2)Murg Milai Tikka     -     Rs 250`");
			System.out.println("`3)Mutton Seekh         -     Rs 150`");
			System.out.println("`4)Chicken Angara       -     Rs 120`");
			System.out.println("`5)Chicken boti         -     Rs 150`");
			System.out.println("`````````````````````````````````````");
			System.out.println(" Choose the option from (1-5)  ");
			int y1=sc.nextInt();
			switch(y1)
			{
			case 1:
				System.out.println("How Much Qty ?");
				int z2=sc.nextInt();
				a2=210;
				sum2=sum2+a2*z2;
				break;
			case 2:
				System.out.println("How Much Qty ?");
				int i2=sc.nextInt();
				b2=250;
				sum2=sum2+b2*i2;
				break;
			case 3:
				System.out.println("How Much Qty ?");
				int j2=sc.nextInt();
				c2=150;
				sum2=sum2+c2*j2;
				break;
			case 4:
				System.out.println("How Much Qty ?");
				int k2=sc.nextInt();
				d2=120;
				sum2=sum2+d2*k2;
				break;
			case 5:
				System.out.println("How Much Qty ?");
				int g2=sc.nextInt();
				d21=150;
				sum2=sum2+d21*g2;
				break;
			}
			res2=res2+sum2;
		}
		else if(x==3)
		{
			res3=0;
			System.out.println("````````````````````````````````````````");
			System.out.println("`1)Butter Chicken Boneless  -     Rs 250`");
			System.out.println("`2)Paneer Butter Masala     -     Rs 140`");
			System.out.println("`3)Mixed Veg Curry          -     Rs 130`");
			System.out.println("````````````````````````````````````````");
			System.out.println(" Choose the option from (1-3)");
			int y3=sc.nextInt();	
			switch(y3)
			{
			case 1:
				System.out.println("How Much Qty ?");
				int z3=sc.nextInt();
				e3=250;
				sum3=sum3+e3*z3;
				break;
			case 2:
				System.out.println("How Much Qty ?");
				int i3=sc.nextInt();
				f3=140;
				sum3=sum3+f3*i3;
				break;
			case 3:
				System.out.println("How Much Qty ?");
				int j3=sc.nextInt();
				h3=130;
				sum3=sum3+h3*j3;
				break;
			}
			res3=res3+sum3;
     		}
			else if(x==4)
			{
				res4=0;
				System.out.println("`````````````````````````````````````");
				System.out.println("`1)Chilli Chicken        -    Rs 210`");
				System.out.println("`2)Veg Manchurian        -    Rs 150`");
				System.out.println("`````````````````````````````````````");
				System.out.println(" choose the option from(1-2)");
				int y4=sc.nextInt();
				switch(y4)
				{
				case 1:
					System.out.println("How Much Qty ? ");
					int z4=sc.nextInt();
					a4=210;
					sum4=sum4+a4*z4;
					break;
				case 2:
					System.out.println("How Much Qty ?");
					int i4=sc.nextInt();
					b4=150;
					sum4=sum4+b4*i4;
					break;
				}
				res4=res4+sum4;
				}
				else
				{
					res5=0;
					System.out.println("`````````````````````````````````````");
					System.out.println("`1)Tandoori roti        -      Rs 50`");
					System.out.println("`2)Rumal roti           -      Rs 40`");
					System.out.println("`````````````````````````````````````");
					System.out.println(" Choose the option from (1-2)");
					int y5=sc.nextInt();
					switch(y5)
					{
					case 1:
						System.out.println("How Much Qty ?");
						int z5=sc.nextInt();
						a5=50;
						sum5=sum5+a5*z5;
						break;
					case 2:
						System.out.println("How Much Qty ?");
						int i5=sc.nextInt();
						b5=40;
						sum5=sum5+b5*i5;
						break;
					
					}
			     res5=res5+sum5;
		}
		System.out.println("If you want to continue ordering press any num from (1-9) or to  exit press  0");
		int x2=sc.nextInt();
		if (x2==0)
			break;
		}
		Bill= res + res2 +res3+res4+res5;
		System.out.println("The Final Bill :" +Bill);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("------------------------------------------");
		System.out.println("|       --  WELCOME TO ZOMATO  --        |");
		System.out.println("------------------------------------------");
		System.out.println();
	    System.out.println("What Do You Want To Order Sir/Medam !");
	    System.out.println();
		ZomatoApplication obj=new ZomatoApplication();
		obj.meth2();
		System.out.println();
		System.out.println("------Thank you Please Visit Again------");
		
	
	}

}
