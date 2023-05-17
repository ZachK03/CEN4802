package main;

public class Main {

	public static void main(String[] args) {
		int n = 10;
		int[] nums = new int[n+1];
		int out = fibRecursive(n,nums);
		System.out.println("The " + n + "th term of the Fibonacci sequence is: " + out);
	}
	
	public static int fibRecursive(int n, int[] fibNums) {
		//If the value at the position isn't NULL, return the value.
		if(fibNums[n] != 0) return fibNums[n];
		//If n is 1 or 2 return 1, it shouldn't recurse anymore.
		if(n == 1 || n == 2) return 1;
		//Recurse and set the value at index n.
		fibNums[n] = fibRecursive(n-1, fibNums) + fibRecursive(n-2, fibNums);
		//Return number at index n.
		return fibNums[n];
	}
}
