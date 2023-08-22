package loops;

public class Demo {

	public static void main(String[] args) {
		
		/*--------------------------------------------------------------------
		int x=1;int y=1;int m=5; int n=5;
		while(x<=m && n>=y) {
		
			System.out.println(x+ " " +n);
			x++;
			n--;
		}
	-----fibanacci series------------------------------------------------------------------		
	int m=10;int x=0;int a=0;int b=1 ; int c;
	System.out.println(a); 
	while(x<=m) {
		c=a+b;
		System.out.println(c);
		b=a;
		a=c;
		x++;                                                                                                                                                                                     
		}
		}
		}
		/* int x=20; int y=1;
		while(x>=11 && y<=10) {
			System.out.println(x+ " " +y);
			x--;
			y++;
		
	}
	------------------------------------------------------------------------
	*/
		/*
		int n1=30;int n2=15;int n3=20;
		while(n1<n2 && n1<n3) {
			System.out.println(n1);
			break;
		}
		while(n2<n1 && n2<n3) {
			System.out.println(n2);
			break;
		}
		while(n3<n2 && n3<n1) {
			System.out.println(n3);
			break;
		}
		--------------------------------------------------------------------
		*/ 
	/*	 int x=10; int y=20; int z=30;int m=1;
         boolean f=true;
         boolean k =true;
         boolean l =true;
         while(m<=1) {
        	 f=(x<y && x<y); 
        	 k=(y<x && y<z);
        	 l=(z<x && z<y);
        	 System.out.println(f );
        	 System.out.println(k );
        	 System.out.println(l );
        	m++; 
         }
         ----20-----------11-1---------------10---------------------------------
         /*/
	/*	 int a=1;int n=20; int n2=14;int x=1;
		 while(a<=20) {
			 if(n>=n2) {
				 System.out.print(" " +n);
				 n--;
			 }
			 else {
				 System.out.print( " " +x);
				 x++
			 }
			
		 }*/
		   
		 
		int x=0;int a=10;int b=20;int c=30;
		while(x<a || x<b || x<c) {
			x++;
		}
		System.out.println(x);

			}
				
		}
	

		

