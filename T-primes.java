import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int n = sc.nextInt();
		long arr[] = new long[n];

		long sq=0;

		long max=0;

		for(int i=0;i<n;i++)
		{
			arr[i] =sc.nextLong();

			max=(long)Math.max(arr[i],max);
		}

		int len = 1000000;

		boolean[] p = new boolean[len+1];

		findPrimes(p);

		for(int i=0;i<n;i++)
		{
			sq=(long)Math.sqrt(arr[i]);

			if(arr[i]==1)
			{
				System.out.println("NO");
				continue;
			}

			if(sq*sq==arr[i]&&p[(int)sq]==true)
			{
				System.out.println("YES");	
			}

			else
			{
				System.out.println("NO");
			}
		}
		
		sc.close();

	}

	public static void findPrimes(boolean[] p)
	{
		p[0] =false;
		p[1] =  false;
		for(int i=2;i<p.length;i++)
		{
			p[i]=true;
		}

		for(int j=2;j*j<p.length;j++)
		{
			if(p[j])
			{
				for(int i=j*j;i<p.length;i+=j)
				{
					p[i]=false;
				}
			}

		}

	}
}