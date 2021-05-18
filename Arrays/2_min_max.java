
public class MinMax {

	public static void main(String[] args) {
		
		int arr[] = {1000, 11, 445, 1, 330, 3000};
		Pair pair = new Pair();
		pair = getMinMax(arr);
		System.out.println("min: " + pair.min);
		System.out.println("max: " + pair.max);

	}
	
	static class Pair{
		private int min;
		private int max;
	}
	
	public static Pair getMinMax(int[] arr) {
		int len = arr.length;
		Pair myPair = new Pair();
		if(len == 1) { 
			myPair.max = myPair.min = arr[0];
			return myPair;
		}
		// if there are more elements in arr
		if(arr[0] > arr[1]) {
			myPair.min = arr[1];
			myPair.max = arr[0];
		}else {
			myPair.min = arr[0];
			myPair.max = arr[1];
		}
		
		for(int i=2; i<len; i++) {
			if(arr[i] > myPair.max) {
				myPair.max = arr[i];
			}
			else if(arr[i] < myPair.min) {
				myPair.min = arr[i];
			}
		}
		return myPair;
	}
}
