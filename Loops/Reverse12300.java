package loops;

public class Reverse12300 {

	public static void main(String[] args) {
		int n=155200,count1=0,count2=0,count=0,x,y,z,k=0,m=0,sum=0,fact=0;
        for(n=155200;n>0;n/=10)
        {
        	x=n%10;
        	sum=sum*10+x; //2551
        	count1++;
             
        }
        for(;sum>0;sum/=10) 
        {    
        	count2++;
        	y=sum%10;
        	
        	k=sum/10;
        	m=k%10;
        	switch(y) 
        	{
        	case 1:if(y==m)
        	       {
        		     System.out.println("Double ");
        		   }
        	       else 
        	    	 System.out.println("one");   
        	break;
        	case 2:if(y==m)
     	           {
     		         System.out.println("Double ");
     		       }
        		   else
        		     System.out.println("two");
        	break;
        	case 3:if(y==m)
     	           {
     		         System.out.println("Double");
     		       }
        		   else
        			 System.out.println("three");
        	break;
        	case 4:
        		   if(y==m)
     	           {
     		         System.out.println("Double");
     		       }
     	           else 
     	    	     System.out.println("four");
        	break;
        	case 5:if(y==m)
     	           {
     		         System.out.println("Double");
     		       }
     	           else 
     	    	     System.out.println("five");
        	break;
        	case 6:if(y==m)
 	               {
 		             System.out.println("Double");
 		           }
 	               else 
        		     System.out.println("six");
        	       break;
        	case 7:if(y==m)
 	               {
 		             System.out.println("Double");
 		           }
 	               else      
 	    	         System.out.println("seven");
        	break;
        	case 8:if(y==m)
 	               {
 		             System.out.println("Double");
 		           }
 	               else 
 	    	         System.out.println("eight");
        	break;
        	case 9:if(y==m)
 	               {
 		             System.out.println("Double");
 		           }
 	               else 
 	            	 System.out.println("nine");
        	break;
        	default :System.out.println("zero");
        	break;
        	}      
        }
            count=count1-count2;
            for(z=1;z<=count;z++)
            {
              fact++;
            }
            switch(fact) 
        	{
        	case 1:System.out.println("one zero");
        	break;
        	case 2:System.out.println("double zero");
        	break;
        	case 3:System.out.println("triple zero");
        	break;
        	case 4:System.out.println("four zero");
        	break;
        	case 5:System.out.println("five zero");
        	break;
        	case 6:System.out.println("six zero");
        	break;
        	case 7:System.out.println("seven zero");
        	break;
        	case 8:System.out.println("eight zero");
        	break;
        	case 9:System.out.println("nine zero");
        	break;
      
	        }
	}
}
