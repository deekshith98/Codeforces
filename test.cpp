#include <iostream>
#include <array>
#include <vector>
#include <queue>
#include <cmath>
#include <algorithm>
#include <set>
#include <map>

using namespace std;

int x[] = {0,0,1,-1};
int y[] = {1,-1,0,0};

int n;
string s="";
bool findExists(string arr[],string word,int index, int i, int j, vector<vector<int>> visited){
	if(word.at(index)!=arr[i].at(j)||i>=n||i<0||j>=n||j<0)
		return false;
	if(index==word.length()-1){
		s=to_string(j+1)+s;
		s=to_string(i+1)+s;
		return true;
	}
	visited[i][j]=1;
	bool exist = false;
	for(int a = 0;a<4;a++)
	{
		if(!visited[i+x[a]][j+y[a]]){
			exist = exist||findExists(arr,word,index+1,i+x[a],j+y[a],visited);
			if(exist){
				s=to_string(j+1)+s;
				s=to_string(i+1)+s;
				break;
			}
		}
		
	}
	visited[i][j]=0;

	return exist;
}

int main(){
	string word;
	cin>>n>>word;

	string arr[n];
	vector<vector<int>> visited(n);


	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
		visited[i]= vector<int>(n);
	}
	bool exist = false;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++){
			s="";
			if(findExists(arr,word,0,i,j,visited)){
				exist=true;
				cout<<"yes"<<" "<<s<<endl;
				break;
			}
		}
	}

	if(!exist)
		cout<<"no"<<endl;

	return 0;
}