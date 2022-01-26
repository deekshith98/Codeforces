import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i=0;i<t;i++){
			
			int n = sc.nextInt();
			int x = sc.nextInt();

			int a[] = new int[n];
			boolean present[] = new boolean[101]; 

			for(int j=0;j<n;j++){
				a[j]=sc.nextInt();
				present[a[j]] = true;
			}

			int count = 0;
			int current = 1;

			int ans=1;

			while(count<x&&current<=100)
			{
				if(!present[current])
				{
					count++;
					current++;
				}
				else
				{
					current++;
				}
			}

			if(count==x)
			{
				while(current<101)
				{
					if(present[current])
						current++;
					else
						break;
				}

				if(current == 101)
					ans=100;
				else
					ans=current-1;
			}
			else if( current ==101)
			{
				ans = 100+x-count;
			}

			System.out.println(ans);
		}
		
	}

}