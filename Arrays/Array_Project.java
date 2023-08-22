package ArrayChapter1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Array_Project {
	public void meth1()
	{
	System.out.println("1)Complete Student Details");
	System.out.println("2}Marks Range details");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int[] {1,2,3,4};
		String s[]=new String[] {"Vishwa","Harsha","Shiney","Prince"};
		String b[]=new String[] {"Mech ","Civ  ","EEE  ","ECE  "};
		int m[]=new int[] {10,20,40,30};
		
		
		while(true)
		{
			System.out.println("1)Complete Student Details");
			
			System.out.println("2}Marks Range details");
			System.out.println("3)Deleteing the record");
			System.out.println("4)Inserting the record");
			System.out.println("5)Single Student detail");
			
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
		{
		System.out.println("------------------------------------");
		System.out.println("Sno|" + "  Name"+"     |"+"  Branch  |  "+ "Marks |");
		System.out.println("------------------------------------");

		for(int y=0;y<a.length;y++)
		{
			System.out.println(a[y]+"  |  " +s[y]+"  |  "+ b[y]+"   |  "+"   " +m[y]+"    |");
		}
		System.out.println("-----------------------------------");
		}
		break;
		case 2:
		//Ascending order from marks to above
		System.out.println("Enter the marks range that you want from");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		System.out.println("------------------------------------");
		System.out.println("Sno|" + "  Name"+"     |"+"  Branch  |  "+ "Marks |");
		System.out.println("------------------------------------");
		for(int z=0;z<a.length;z++)
		{
			Arrays.sort(m);
			if(m[z]>=x1 && m[z]<=x2 )
			{
				System.out.println(a[z]+"  |  " +s[z]+"  |  "+ b[z]+"   |  "+"" +m[z]+"    |");
			}
		}
		System.out.println("------------------------------");
		break;
		case 3:
			System.out.println("index");
			int n=sc.nextInt();
			for(int y=n;y<a.length-1;y++)
			{
				a[y]=a[y+1];
				b[y]=b[y+1];
				s[y]=s[y+1];
				m[y]=m[y+1];	  
			}
			System.out.println("------------------------------------");
			System.out.println("Sno|" + "  Name"+"     |"+"  Branch  |  "+ "Marks |");
			System.out.println("------------------------------------");

			for(int y=0;y<a.length-1;y++)
			{
				System.out.println(a[y]+"  |  " +s[y]+"  |  "+ b[y]+"   |  "+"" +m[y]+"    |");
			}
			System.out.println("------------------------------------");
			
			break;
		case 4:
			System.out.println("index");
			int n1=sc.nextInt(),y;
			for(y=a.length-1;y>n1;y--)
			{
				a[y]=a[y-1];
					  
			}
			
			System.out.println("Enter serial num");
			int n2=sc.nextInt();
			a[y]=n2;
			
			for(y=a.length-1;y>n1;y--)
			{
				
				s[y]=s[y-1];
					  
			}

			System.out.println("enter name");
			String n3=sc.next();
			s[y]=n3;
			for(y=a.length-1;y>n1;y--)
			{
				
				b[y]=b[y-1];
				 
			}

			System.out.println();
			System.out.println("enter branch");
			String n5=sc.next();
			b[y]=n5;
			for(y=a.length-1;y>n1;y--)
			{
				
				m[y]=m[y-1];	  
			}

			
            System.out.println("enter marks");
			int n4=sc.nextInt();
			
			
			
			m[y]=n4;
			System.out.println("------------------------------------");
			System.out.println("Sno|" + "  Name"+"     |"+"  Branch  |  "+ "Marks |");
			System.out.println("------------------------------------");
			for(int z=0;z<a.length;z++)
			{
				System.out.println(a[z]+"  |  " +s[z]+"  |  "+ b[z]+"   |  "+"" +m[z]+"    |");
			}
			System.out.println("------------------------------------");
			break;
		case 5:
			System.out.println("Enter marks number");
			//int i= sc.nextInt();
			String Search=sc.next();
			for(int x5=0;x5<a.length;x5++)
			{
				if((s[x5].equalsIgnoreCase(Search)))
					System.out.println(a[x5]+"    " +s[x5]+"    "+ b[x5]+"     "+"" +m[x5]);
			}
			break;
			
			
		}
		System.out.println("To Check Std Details further Press" +" 1");
		System.out.println("To Exit Press"+" 0");
		int k=sc.nextInt();
		if(k==0)
		{
			break;
		}
		
		}	
	}

}
