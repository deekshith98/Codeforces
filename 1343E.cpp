#include <iostream>
#include <array>
#include <vector>
#include <queue>
#include <cmath>
#include <algorithm>

typedef long long LL; 
// typedef pair<int, int> pii; 
// typedef pair<LL, LL> pll; 
// typedef pair<string, string> pss; 
// typedef vector<int> vi; 
// typedef vector<vi> vvi; 
// typedef vector<pii> vii; 
// typedef vector<LL> vl; 
// typedef vector<vl> vvl;

#define vi vector<int>
#define vvi vector<vi>

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

	int t,n,m,a,b,c;

	cin>>t;

	fr(i,t){
		cin>>n>>m>>a>>b>>c;
		vi p;
		fr(j,m){
			int input;
			cin>>input;
			p.pb(input);
		}
		sort(p.begin(),p.end());
		vector<LL> pref(m+1);
		pref[0]=0;
		fr(j,m){
			pref[j+1]=pref[j]+p[j];
		}
		vi da(n+1,INF),db(n+1,INF),dc(n+1,INF);
		g=vvi(n+1);

		fr1(j,1,m){
			int u,v;
			cin>>u>>v;
			g[u].pb(v);
			g[v].pb(u);
		}

		bfs(a,da);
		bfs(b,db);
		bfs(c,dc);

		LL ans = 1e18;

		fr1(j,1,n){
			if(da[j]+db[j]+dc[j]>m)continue;
			ans = min(ans, (LL)pref[db[j]]+pref[da[j]+db[j]+dc[j]]);
		}
		cout<<ans<<endl;
	}

	return 0;
}