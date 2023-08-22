package ArrayChapter1;

public class SeconddddLargestt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{2,8,6,4,3,7,5,1};  
		int low1=Integer.MAX_VALUE ;   
		int  low2=Integer.MAX_VALUE;     
		int low3=Integer.MAX_VALUE;     
		for(int i=0;i<arr.length;i++)

        {
            if(arr[i]<low1){
              //  low3=low2;        
                low2=low1;          
                low1=arr[i];           
                }
            else if(arr[i]<low2)
            {
           //  low3=low2;        
             low2=arr[i];    
            }
//            else if(arr[i]<low3)
//            {
//                low3=arr[i];      
//            }

        }
        System.out.println(low1); 
        System.out.println(low2);     
        //System.out.println(low3);
	}

}
