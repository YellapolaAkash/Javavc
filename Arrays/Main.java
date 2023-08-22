package ArrayChapter1;

import java.util.*;

public class Main
{
	public static boolean isRoundNumber(int n)
	{
		int next_Number;
		HashSet<Integer> hs=new HashSet();
		while(n!=1 && !hs.contains(n))
		{
			hs.add(n);
			next_Number=getNextNumber(n);
			n=next_Number;
		}
		return n==1;
	}
	public static int getNextNumber(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem*rem;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isRoundNumber(n))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
/*
 *  import java.util.*;

public class DecreasingPermutation 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] permutation = new int[n];
        boolean[] used = new boolean[n + 1];

        generatePermutation(permutation, used, n, k, 0);

        for (int i = 0; i < n; i++) {
            System.out.print(permutation[i] + " ");
        }
    }

    public static void generatePermutation(int[] permutation, boolean[] used, int n, int k, int index)
     {
        if (index == n) {
            return;
        }

        for (int i = n; i >= 1; i--) {
            if (!used[i] && (index == 0 || Math.abs(permutation[index - 1] - i) == k)) {
                permutation[index] = i;
                used[i] = true;
                generatePermutation(permutation, used, n, k, index + 1);
                used[i] = false;
            }
        }
    }
}*/
