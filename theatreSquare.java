import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();

		int l1,l2;

		if(a>=n)
		{
			l1=1;
		}
		else
		{
			if(n%a==0)
			{
				l1=n/a;
			}
			else
			{
				l1=n/a + 1;
			}
		}

		if(a>=m)
		{
			l2=1;
		}
		else
		{
			if(m%a==0)
			{
				l2=m/a;
			}
			else
			{
				l2=m/a + 1;
			}
		}

		System.out.println((long)(l1*l2));

		sc.close();

	}

}