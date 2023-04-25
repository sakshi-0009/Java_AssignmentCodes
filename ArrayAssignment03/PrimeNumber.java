package ArrayAssignment03;

import java.io.*;

public class PrimeNumber {

	void isPrimeNumber(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int n = arr[i];
			int count = 0;
			for(int j=1; j<=n; j++) {
				if(n%j==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(arr[i]+" is a prime number found at index "+i);
			}
			else {
				System.out.println(arr[i]+" is not a prime number");
			}
		}
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		PrimeNumber obj = new PrimeNumber();
		obj.isPrimeNumber(arr);
	}
}
