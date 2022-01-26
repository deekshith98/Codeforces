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

vvi g;

void bfs(int s, vi &d)
{
	d[s] = 0;

	queue<int> q;
	q.push(s);
	
	while(!q.empty()){
		int cur = q.front();
		q.pop();

		for(auto v:g[cur]){
			if(d[v] == INF){
				d[v] = d[cur]+1;
				q.push(v);
			}
		}
	}
}

int main(){

	int l,n;
	cin>>n>>l;
	vi arr(n);
	for(auto &it:arr)
		cin>>it;
	sort(arr.begin(),arr.end());
	int ans=0;
	fr1(i,1,n-1){
		ans = max(ans,arr[i]-arr[i-1]);
	}
	ans = max(ans,(arr[0]-0)*2);
	ans = max(ans,(l-arr[n-1])*2);
	cout<<ans/2.0<<endl;
	return 0;

}