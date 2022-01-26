#include <iostream>
#include <array>
#include <vector>
#include <queue>
#include <cmath>
#include <algorithm>
#include <set>
#include <map>

typedef long long LL;

#define vi vector<int>
#define vvi vector<vi>
#define vl vector<LL>
#define vvl vector<vl>
#define pii pair<int, int>
#define vii vector<pii>
#define fr(i,n) for(int i=0;i<n;i++)
#define fr1(i,a,n) for(int i=a;i<=n;i++)
#define fi first
#define se second
#define mp make_pair
#define pb push_back

int INF = 2000000005; 
long long INFF = 1000000000000000005LL;

using namespace std;

int main(){
	int n,a,b,c;
	cin>>n>>a>>b>>c;
	int dp[n+1];
	int Min = a;
	Min  = min(Min,b);
	Min = min(Min,c);
	bool p[n+1];
	fr1(i,0,Min-1){
		dp[i]=0;
		p[i] = false;
	}
	dp[Min] = 1;
	p[0] = true;
	p[Min] = true;
	fr1(i,Min+1,n){
		dp[i]=0;
		p[i] = false;
		if(i-a>=0&&p[i-a]){
			dp[i]=max(dp[i],dp[i-a]+1);
			p[i] = true;
		}
		if(i-b>=0&&p[i-b]){
			dp[i]=max(dp[i],dp[i-b]+1);
			p[i] =true;
		}
		if(i-c>=0&&p[i-c]){
			dp[i]=max(dp[i],dp[i-c]+1);
			p[i] = true;
		}
	}
	cout<<dp[n]<<endl;
	return 0;
}