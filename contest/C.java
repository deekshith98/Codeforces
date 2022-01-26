import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();

		int m = sc.nextInt();

		int l[] = new int[m+1];

		long sum[] = new long[m+1];

		sum[0] = 0;

		for(int j=1;j<=m;j++){
			l[j]=sc.nextInt();
			sum[j] = sum[j-1]+l[j];
		}

		int p[] = new int[m+1];

		p[1] = 1;

		boolean possible = true;

		for(int j=2;j<=m;j++)
		{
			if(p[j-1]>=n-l[j]+1)
			{
				possible = false;
				break;
			}

			if(sum[m]-sum[j-1]<n-p[j-1]-l[j-1]+1)
			{
				possible = false;
				break;
			}

			if(sum[m]-sum[j-1]==n-p[j-1]-l[j-1]+1)
			{
				p[j]=p[j-1]+l[j-1];
			}

			else if(sum[m]-sum[j-1]>n-p[j-1]-l[j-1]+1&&sum[m]-sum[j-1]<n-p[j-1])
			{
				p[j]= n-(int)(sum[m]-sum[j-1])+1;
			}

			else if(sum[m]-sum[j-1]>=n-p[j-1])
			{
				p[j] = p[j-1]+1;
			}

		}
		
		if(m==1)
		{
			if(l[1]!=n)
				possible=false;
		}

		if(possible)
		{
			for(int j = 1;j<=m-1;j++)
			{
				System.out.print(p[j]+" ");
			}
			System.out.print(p[m]);
			System.out.println();
		}
		else
		{
			System.out.println(-1);
		}
		
	}
}