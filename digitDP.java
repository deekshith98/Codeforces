public class Solution {
    public static void main(String[] args) {
    	System.out.println(solve("20",4));
    }

    public static int solve(String s, int k){
    	int n = s.length();
    	int dp[][][] = new int[n][k][2];
    	
    	for(int a = 0; a<n;a++){
    	    for(int b = 0; b<k;b++){
    	        for(int c = 0; c<2;c++){
    	            dp[a][b][c]=-1;
    	        }
    	    }
    	}

    	return solveUtil(new StringBuffer(s).reverse().toString(),n-1,1,0,k,dp);
    }

    public static int solveUtil(String s, int index, int tight, int sum, int k,int dp[][][]){
    	if(index==-1){
    		if(sum%k==0)
    			return 1;
    		else
    			return 0;
    	}

    	if(dp[index][sum][tight]!=-1)
    		return dp[index][sum][tight];

    	int result = 0;

    	int limit = tight==1?digit(s.charAt(index)):9;

    	for(int i = 0;i <= limit;i++){
    		int newTight = i==digit(s.charAt(index))&&tight==1?1:0;
    		result+=solveUtil(s,index-1,newTight,(sum+i)%k,k,dp);
    	}

    	dp[index][sum][tight] = result;

    	return result;
    }
    
    public static int digit(char c){
        String s = ""+c;
        return Integer.valueOf(s);
    }
}