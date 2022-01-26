import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int  n = sc.nextInt();

		int edges[][] = new int[n][n];

		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				edges[i][j]=-1;

		int u,v;

		for(int i=1;i<n;i++)
		{
			u = sc.nextInt();
			v = sc.nextInt();
		}
	}
}