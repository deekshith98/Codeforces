import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{
			int h = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();

			for(int j=0;j<n;j++)
			{
			    if(h<=20)
			        break;
				h=h/2+10;
			}

			h=h-m*10;

			if(h<=0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}