import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();

		int count[] = new int[200000+1];

		for(int i = 0;i<=200000;i++)
			count[i]=0;

		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();

			int arr[] = new int[n];

			
			int distinct = 0;
			int max = -1;
			
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
				if(count[arr[j]]>0)
				{
					count[arr[j]]++;
					max=Math.max(max, count[arr[j]]);
				}
				else
				{
					count[arr[j]]++;
					distinct++;
					max=Math.max(max, count[arr[j]]);
				}
			}

			int start = 0;
			int end=n/2;
			int mid=0;
			
			while(start<end)
			{
				mid = (start+end)/2;
				
				if(end-start==1)
				{
				    if((distinct>=end&&max>=end+1)||(distinct>=end+1&&max>=end))
				    {
				        start = end;
				    }
				    break;
				}

				if((distinct>=mid&&max>=mid+1)||(distinct>=mid+1&&max>=mid))
				{
					start=mid;
				}
				else
				{
					end=mid-1;
				}
			}

			System.out.println(start);

			for(int a:arr)
			{
				count[a]=0;
			}
		}
	}
}