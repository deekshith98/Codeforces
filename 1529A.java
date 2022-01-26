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
	int min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++){
		min = Math.min(min,arr[i]);
        }
        return arr.length-countInArr(arr,min);
        }

    static int countInArr(int arr[],int num){
    	int count=0;
    	for(int i:arr){
    	if(i==num)
    		count++;
    }
    return count;
    }
}