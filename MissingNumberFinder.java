import java.util.Scanner;

class MissingNumberFinder{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size-1];
		for(int i=0; i<size-1; i++)
			arr[i] = in.nextInt();
		System.out.println(missingNumberFinder(arr, size));
	}

	static int missingNumberFinder(int array[], int n){
		// write your code here
		// Sum of first N positive integers
		int res = (n*(n+1))/2;

		// Subtracting the values of the array from the sum.
		// The remaining value will be the missing value.
		for(int val : array){
			res -= val;
		}
		return res;
	}
}