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

	int n,m;
	cin>>n>>m;
	int l = max(n,m);
	g = vvi(2*l+1);
	fr1(i,1,l){
		g[i].pb(i*2);
	}
	fr1(i,1,2*l){
		g[i].pb(i-1);
	}

	vi d((l)*2+1,INF);

	bfs(n,d);

	cout<<d[m]<<endl;

	return 0;
}