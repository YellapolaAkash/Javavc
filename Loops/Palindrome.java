package loops;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		int x=121,rev=0,n=0,temp=x;
		Student student1=new Student("Sohel");
		Student student2=new Student("Laxman");
		Student student3=new Student("Chaitanya");
		Student a[]=new Student[] {student1,student2,student3};
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(x=121;x>0;x/=10)
		{
			
			n=x%10;
			rev=rev*10+n;
		}
		if(rev==temp)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	public String toString() {
		return "Name="+name;
	}
}
