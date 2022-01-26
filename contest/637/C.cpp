#include <iostream>
#include <array>
#include <vector>
#include <queue>
#include <cmath>
#include <algorithm>
#include <set>
#include <string>

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

	cin>>t;

	while(t--){

		int n;

		cin>>n;
		int p[n+1];
		fr1(i,1,n){
			cin>>p[i];
		}
		int pos[n+1];
		fr1(i,1,n){
			pos[p[i]]=i;
		}
		int last=n;
		bool ok = true;
		string ans = "YES";
		int f[n+1]={0};
		for(int i=1;i<=n;i++){
			int current=pos[i];
			while(current<=last&&i<=n){
				if(current!=pos[i]){
					ok = false;
					break;
				}
				f[pos[i]]=1;
				current++;
				if(current>last)
					break;
				i++;
			}
			if(!ok)
				break;
			int j = last;
			while(f[j]!=0){
				j--;
			}
			last=j;
			
		}
		if(!ok)
			ans = "NO";
		cout<<ans<<endl;

	}

	return 0;
}