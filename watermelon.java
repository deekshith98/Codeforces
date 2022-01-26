import java.util.*;

public class Solution{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		int n = sc.nextInt();

		if(n%2!=0)
		{
			System.out.println("NO");
		}
		else if(n==2)
		{
			System.out.println("NO");	
		}
		else
		{
			System.out.println("YES");
		}

		sc.close();
	}
}