package string_Chapter1;

public class Split_method {

	public static void main(String[] args) {
	    String s=new String ("hello all good morning");
	    // split method: converts string into string array
	    String []a=s.split(" ");
	    for(String temp:a)
	    {
	    	System.out.println(temp);
	    }

	}

}
