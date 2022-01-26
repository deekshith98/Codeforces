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

String num[10];
num[0] = "1110111";
num[1] = "0010010";
num[2] = "1011011";
num[3] = "1011011";
num[4] = "0111010";
num[5] = "1101011";
num[6] = "1101111";
num[7] = "1010010";
num[8] = "1111111";
num[9] = "1111011";

int tiks[10];
tiks[0]=7;
tiks[1]=2;
tiks[2]=5;
tiks[3]=5;
tiks[4]=4;
tiks[5]=5;
tiks[6]=6;
tiks[7]=3;
tiks[8]=7;
tiks[9]=6;

using namespace std;

int number(String s){
	fr(i,10){
		if(s.compare(num[i])==0)
			return i;
	}

	return -1;
}

int main(){

	int n,k;
	cin>>n>>k;
	vi dig;
	fr(i,n){
		String input;
		cin>>input;
		dig.pb(number(input));
	}
	fr(i,n){
		if(k==0)
			break;
		fr1(j,dg[i]+1,9){
			if(tiks[j]-tiks[dig[i]]<=k)
				
		}
	}
	if(k!=0)
		cout<<-1<<endl;
	else
		cout<<ans<<endl;
	return 0;
}