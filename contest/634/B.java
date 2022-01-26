import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			String s="";
			StringBuilder ans = new StringBuilder();
			int k =n/b;
			for(int j=0;j<b;j++)
				s=s+(char)(97+j);

			for(int j = 0;j<k;j++)
			{
				ans.append(s);
			}

			for(int j=0;j<n%b;j++)
				ans.append((char)(97+j));

			System.out.println(ans.toString());
		}
	}
}