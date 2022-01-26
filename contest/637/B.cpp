#include <iostream>
#include <array>
#include <vector>
#include <queue>
#include <cmath>
#include <algorithm>
#include <set>

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

	int t;
	int n,k;
	cin>>t;
	while(t--){
		cin>>n>>k;
		int arr[n];
		fr(i,n){
			cin>>arr[i];
		}
		vi p(n,0);
		fr1(i,1,n-2){
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
				p[i]=1;
		}
		vi count(n,0);
		count[0]=0;
		fr1(i,1,n-2){
			if(p[i])
				count[i]=count[i-1]+1;
			else
				count[i]=count[i-1];
		}
		int ans=-1;
		int l=-1;
		for(int i=0;i<=n-k;i++)
		{
			if(count[i+k-2]-count[i]>ans){
				ans=count[i+k-2]-count[i];
				l=i;
			}

		}
		cout<<ans+1<<" "<<l+1<<endl;
	}

	return 0;
}