import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int max1=-1,min1=100000,max2=-1,min2=100000;
		int l = s.length();

		for(int i=0;i<l-1;i++)
		{
			if(s.charAt(i)=='A'&&s.charAt(i+1)=='B')
			{
				max1 = Math.max(max1,i);
				min1 = Math.min(min1,i);
			}

			if(s.charAt(i)=='B'&&s.charAt(i+1)=='A')
			{
				max2 = Math.max(max2,i);
				min2 = Math.min(min2,i);
			}
		}

		if(max1==-1||max2==-1)
		{
			System.out.println("NO");
		}
		else if(max2-min1>1||max1-min2>1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}