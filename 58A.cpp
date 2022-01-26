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

	string s;

	cin>>s;

	int l = s.length();

	char w[] ={'h','e','l','l','o'};

	int cur=0;

	int ok =false;
	int i=0;

	while(i<l){

		if(w[cur]==s[i]){
			cur++;
		}
		i++;
		if(cur==5){
			ok = true;
			break;
		}

	}
	string ans="NO";
	if(ok){
		ans = "YES";
	}

	cout<<ans<<endl;

	return 0;
}