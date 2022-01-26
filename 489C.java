import java.math.BigInteger;
import java.util.*;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int s = sc.nextInt();

		String max,min,num;
		String s1,s2,s3;

		int i;

		String dp[][] = new String[m+1][s+1];
		int temp=s;

		if(s>m*9)
		{
			max="-1";
		}
		else
		{
			i=0;
			num="";
			while(i<m)
			{
				if(s>=9)
				{
					num+="9";
					s-=9;
				}
				else if(s>0)
				{
					num+=Integer.toString(s);
					s=0;
				}
				else if(s==0)
				{
					num+="0";
				}

				i++;
			}
			
			if(num.charAt(0)=='0')
			{
			    num="0";
			}
			
			if(num.length()<m)
			{
			    max="-1";
			}
			else{
			max=num;
			}
		}
		
		s=temp;

		if(s>m*9)
		{
			min="-1";
		}
		else
		{
			dp[1][0] ="0";
			for(int k=2;k<=m;k++)
			{
				dp[k][0] = "-1";
			}
			for(int k=0;k<=s;k++)
			{
				dp[0][k] = "-1";
			}

			for(int i1=1;i1<=m;i1++)
			{
				for(int i2=1;i2<=s;i2++)
				{
					s1 = !(dp[i1-1][i2-1].equalsIgnoreCase("-1"))?"1"+dp[i1-1][i2-1]:"-1";
					s2 = !(dp[i1-1][i2].equalsIgnoreCase("-1"))?add1(dp[i1-1][i2]):"-1";
					s3 = !(dp[i1][i2-1].equalsIgnoreCase("-1"))?add2(dp[i1][i2-1]):"-1";

					dp[i1][i2] = minimum(minimum(s1,s2),s3);
					
				}
			}
			
			min = dp[m][s];

		}

		System.out.println(min+" "+max);
	}

	public static String minimum(String s1, String s2)
	{
		if(s1.equalsIgnoreCase("-1")&&s2.equalsIgnoreCase("-1"))
		{
			return "-1";
		}
		else if(s1.equalsIgnoreCase("-1"))
		{
			return s2;
		}
		else if(s2.equalsIgnoreCase("-1"))
		{
			return s1;
		}
		else
		{
			return compare(s1,s2);
		}

	}

	public static String compare(String s1,String s2)
	{
		BigInteger b1 = new BigInteger(s1);
		BigInteger b2 = new BigInteger(s2);

		return (b1.min(b2)).toString();
	}

	public static String add1(String s)
	{
		int n = Integer.parseInt(String.valueOf(s.charAt(0)));
		n=n-1;

		return "1"+Integer.toString(n)+s.substring(1);
	}

	public static String add2(String s)
	{
		int n;
		if(s.charAt(0)=='9')
		{
			return "-1";
		}
		else
		{
			int i=s.length()-1;

			while(i>=0)
			{
				n=Integer.parseInt(String.valueOf(s.charAt(i)));
				if(n<9&&i!=s.length()-1)
				{
					return s.substring(0,i)+Integer.toString(n+1)+s.substring(i+1);
				}
				else if(n<9)
				{
					return s.substring(0,i)+Integer.toString(n+1);	
				}

				i--;
			}
		}
		
		return s;
	}
}