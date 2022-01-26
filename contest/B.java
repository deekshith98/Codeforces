import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i=0;i<t;i++){
			
			int n = sc.nextInt();

			int arr[]  =new int[n+1];
			int rev[]  = new int [n+1];

			for(int j=1;j<=n;j++)
			{
				arr[j] = sc.nextInt();
				rev[n-j+1] = arr[j];
			}

			boolean perm1[] = new boolean[n+1];
			boolean perm2[] = new boolean[n+1];

			solve(perm1,arr);
			solve(perm2,rev);

			ArrayList<Integer> list = new ArrayList<Integer>();

			for(int j = 1;j<=n-1;j++)
			{
				if(perm1[j]&&perm2[n-j])
					list.add(j);
			}

			System.out.println(list.size());
			for(int j=0;j<list.size();j++){
				System.out.println(list.get(j)+" "+(n-list.get(j)));
			}	
		}
		
	}

	public static void solve(boolean perm[], int arr[])
	{
		int min = 1;

		boolean exist[] = new boolean[arr.length];

		for(int i=0;i<=arr.length-1;i++)
			exist[i] = false;

		for(int i=1;i<arr.length-1;i++)
		{
			exist[arr[i]] = true;

			while(exist[min]==true)
			{
				min++;
			}

			if(min == i+1)
				perm[i]=true;
			else
				perm[i]=false;
		}
	}

}