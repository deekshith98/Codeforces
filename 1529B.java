import java.util.*;

public class Solution{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int n=0;n<t;n++){
			int l = sc.nextInt();
			int arr[] = new int[l];
			for(int i=0;i<l;i++)
				arr[i]=sc.nextInt();
			System.out.println(solve(arr));
		}
	}

	static int solve(int arr[]){
    	Arrays.sort(arr);
    	int fPos=-1;
    	int fZ=-1;
    	for(int i=0;i<arr.length;i++){
    	    if(arr[i]==0)
    	        fZ=i;
    		if(arr[i]>0){
    		fPos=i;
            break;
            }
        }
        if(fPos==-1){
        	return arr.length;
        }
        boolean possible=true;
        for(int i=1;i<fPos;i++){
        	if(arr[i]-arr[i-1]<arr[fPos]){
        		possible=false;
        		break;
        	}
        }
        if(!possible)
            return fPos;
        return fPos+1;
    
    }
}