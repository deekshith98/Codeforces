import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int k = sc.nextInt();

			char res[] = new char[n];

			for(int j=0;j<n;j++)
				res[j]='a';

			int p1 = 0;
			int p2=0;

			long end = (long)n*(n-1)/2;
			int b=n;

			while(p1<n-2)
			{
				if(k<=end-(b-1)){
					p1++;
					end = end-(b-1);
					b--;
				}
				else
				{
					p2 = n-(b-1-(int)(end-k));
					break;
				}
			}

			if(p1==n-2)
				p2=n-1;

			res[p1]='b';
			res[p2]='b';

			System.out.println(String.valueOf(res));
		}
		
	}

}