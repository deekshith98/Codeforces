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
	int a,b,c,d,n;
	cin>>t;
	while(t--){
		cin>>n>>a>>b>>c>>d;

		if((a-b)*n>(c+d)||(a+b)*n<(c-d))
		{
			cout<<"NO"<<endl;
		}

		else 
		{
			cout<<"YES"<<endl;
		}

	}

	return 0;
}