import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();

			int ans = 1;
			int current=0;

			for(int a=1;a<=26;a++)
			{
				for(int b=1;b<=26;b++)
				{
					current =0;
					if(a==b)
					{
						for(int x:arr)
						{
							if(x==a)
								current++;
						}
						ans = Math.max(ans,current);
					}
					else
					{
						count = 0;

						for(int x:arr)
						{
							if(x==a)
								count++;
						}

					}
				}
			}
		}
	}
}