import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int n= sc.nextInt();
		int k= sc.nextInt();
		int count=0;
		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		if(k==n&&arr[k-1]!=0)
		{
			count=k;
		}

		

		if(arr[k-1]==0)
		{
			for(int i=0;i<n;i++)
			{
				if(i<k)
				{
					if(arr[i]!=0)
					{
						count++;
					}
				}
			}
		}

		else if(arr[k-1]!=0&&n!=k)
		{
			count=k;
			for(int i=k;i<n;i++ )
			{
				if(arr[i]==arr[k-1])
				{
					count++;
				}
			}
		}

		System.out.println(count);
	}
}