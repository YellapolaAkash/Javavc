package ArrayChapter1;
import java.util.Arrays;
public class Binary_Search_preDefinedmethod {

	public static void main(String[] args) {
	int a[]=new int[] {10,20,50,30,40,80};
	Arrays.sort(a);
	System.out.println(Arrays.binarySearch(a,30));
	}

}
