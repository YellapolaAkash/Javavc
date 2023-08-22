package string_Chapter1;

public class xyz
{
 public static void main(String [] args)
  {
    String s=new String("hello all good morning");//Helo Al God Mornig
    String a[]=s.split(" ");
    String i="";
    int count=1;
    for(int x=0;x<a.length;x++)
     {
      i="";
      for(int y=0;y<a[x].length();y++)
        {
           if(y==0)
           { 
           i=i+a[x].charAt(y);
           i=i.toUpperCase();
           }
           else
           { 
             i=i+a[x].charAt(y);
           }
         }
       a[x]=i;
     }
    for(int x=0;x<a.length;x++)
    {
    	char ch[]=a[x].toCharArray();
    	boolean b[]=new boolean[ch.length];
    	for(int y=0;y<ch.length;y++)
    	{
    		if(b[y]==true)
    	    {
    		continue;
    	     }
    	count=1;
    		for(int z=y+1;z<ch.length;z++)
    		{
    			if(ch[y]==ch[z])
    			{
    				b[z]=true;
    				count++;
    			}
    		}
    		if(count>=1)
        	{
        		System.out.println(ch[y]);
        	}	
    	}	
    }  
 }
}
//****output****
//H
//e
//l
//o
//A
//l
//G
//o
//d
//M
//o
//r
//n
//i
//g

           
            