import java.util.Arrays;

/*
 * time -> O(n), Space -> O(1) , order is not maintained!!!
 * */

public class AllNegativeNumbers {

	public static void main(String[] args) {
		
		int[] arr = {-1,-5,2,100,8,-4,80,-1};

		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			if(arr[low] < 0 && arr[high] < 0) {
				low++;
			}
			else if(arr[low] > 0 && arr[high] > 0) {
				high--;
			}
			else if(arr[low] > 0 && arr[high] < 0) {
				int t = arr[low];
				arr[low] = arr[high];
				arr[high] = t;
				low++;
				high--;
			}
			else{
				low++;
				high--;
			}
		}
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
