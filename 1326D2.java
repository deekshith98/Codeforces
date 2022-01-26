import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i=0;i<t;i++){
			
			String s = sc.next();

			int l = s.length();

			int start =0;
			int end =l-1;

			int endPrefix=0;
			int startSuffix=l;
			
			String prefix="",suffix="";

			while(s.charAt(0)==s.charAt(l-1)&&true)
			{
				if(end-start==2&&s.charAt(start)==s.charAt(end))
				{
					endPrefix = start+1;
					startSuffix = end;
					break;
				}
				if(end-start==1&&s.charAt(start)==s.charAt(end))
				{
					endPrefix = start;
					startSuffix = end;
					break;
				}

				if(s.charAt(start)==s.charAt(end))
				{
					start++;
					end--;
				}
				else
				{
				    endPrefix = start-1;
				    startSuffix = end+1;
					break;
				}
			}

			if(startSuffix==l)
			{
			    suffix = "";
			    prefix = s.substring(0,endPrefix+1)+computePalindrome(s.substring(endPrefix+1,startSuffix));
			}
			else if(startSuffix-endPrefix!=1)
			{
			    
			}
			else
			{
			    prefix = s.substring(0,endPrefix+1);
			    suffix = s.substring(startSuffix,l);
			}

			System.out.println(prefix+suffix);
		}
		
	}

	public static String computePalindrome(String s)
	{
		// not complete
	}

}