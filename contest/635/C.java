	import java.util.*;

	
	public class Solution{
	    
	   class Pair{
		int node;
		int children;
		int dis;

		public Pair(int node,int children,int dis)
		{
			this.node = node;
			this.children = children;
			this.dis = dis;
		}
	}

	class Compare implements Comparator<Pair>{

		public int compare(Pair a,Pair b)
		{
			
			return b.children-b.dis-a.children+a.dis;
		}

	}
		public static void main(String[] args) {
		    
		    new Solution().sol();
		    
		}
		public void sol(){
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int k = sc.nextInt();

			int u,v;

			ArrayList<Integer> e[] = new ArrayList[n+1];

			for(int i=1;i<=n;i++)
				e[i] = new ArrayList<Integer>();

			for(int i=1;i<=n-1;i++)
			{
				u = sc.nextInt();
				v = sc.nextInt();
				e[u].add(v);
				e[v].add(u);
			}

			int c[] = new int[n+1];
			boolean visited[] = new boolean[n+1];
			boolean industry[] = new boolean[n+1];
			int d[] = new int[n+1];
			int dis[] = new int[n+1];
			long ans=0;

			for(int i=0;i<=n;i++){
				visited[i]=false;
				industry[i]=true;
				d[i] = 0;
			}

			dfs(1,e,c,visited,dis,0);

			ArrayList<Pair> childs = new ArrayList<Pair>();

			for(int i = 1;i<=n;i++)
			{
				childs.add(new Pair(i,c[i],dis[i]));
			}

			Collections.sort(childs,new Compare());

			for(int i=0;i<n-k;i++)
			{
				industry[childs.get(i).node] = false;
			}

			for(int i=0;i<=n;i++){
				visited[i]=false;
			}
			solve(1,e,d,industry,1,visited);



			for(int i=1;i<=n;i++)
			{
				if(industry[i])
				{
					ans+=d[i];
				}
			}

			System.out.println(ans);


		}

		public int dfs(int s, ArrayList<Integer> e[], int c[], boolean visited[], int dis[],int current)
		{
			visited[s] = true;
			c[s]=0;
			dis[s]=current;
			for(int i=0;i<e[s].size();i++ )
			{
				if(!visited[e[s].get(i)])
				{
					c[s] +=dfs(e[s].get(i),e,c,visited,dis,current+1)+1;
				}
			}

			return c[s];
		}

		public void solve(int s, ArrayList<Integer> e[], int d[], boolean industry[],int tourism,boolean visited[])
		{
			visited[s] = true;
			for(int i=0;i<e[s].size();i++ )
			{
				if(!visited[e[s].get(i)])
				{
					if(industry[e[s].get(i)])
					{
						d[e[s].get(i)]=tourism;
						solve(e[s].get(i),e,d,industry,tourism,visited);
					}
					else
					{
						solve(e[s].get(i),e,d,industry,tourism+1,visited);
					}
				}
			}
		}
	}