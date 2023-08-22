package string_Chapter1;
public class Q29 
{

	public static void main(String[] args) {
	String s=new String("Hello this is codinghub user");//User codinghub eth is siht Hello
	String a[]=s.split(" ");
	int count=a.length-1;
//	String temp=a[count];
	for(int x=0;x<=a.length/2;x++)
	{
		String temp=a[count];
		a[count]=a[x];
		a[x]=temp;
		count--;
		if(x==a.length/2)
		{
		 StringBuffer sb=new StringBuffer(a[x]);
		 sb.reverse();
		 a[x]=sb.toString();
		}
	}
	for(String temp2:a)
	{
		System.out.println(temp2);
	}
	}
}
