package loops;

public class AutomaticNumber {

	public static void main(String[] args) {
		int a=14,pro=1,x=1,rev=0,sum=0,y=1,mul=1,z=0,fun=0;
				while(x<=2) 
				{
					pro=pro*a;   //144
					x++;
				}
		        while(a!=0)
		        {
		            rev=a%10;
		            sum=sum*10+rev; //21
		            a=a/10;
		        }
                while (y<=2)
                {
                	mul=mul*sum; //441
                	y++;
                }
                while(pro!=0)
                {
                	z=pro%10;
		            fun=fun*10+z; //
		            pro=pro/10;
                }
                if (fun==mul) 
                {
                	System.out.println("Automatic");
                }
                else 
                {
                	System.out.println("not automatic");
                }
                	
	}

}
