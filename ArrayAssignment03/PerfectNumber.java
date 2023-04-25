package ArrayAssignment03;

import java.io.*;

public class PerfectNumber {

	void isPerfectNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			int sum = 0;
			for(int j=1;j<n;j++) {
				if(n%j==0) {
					sum = sum+i;
				}
			}
			if(sum==n) {
				System.out.println(arr[i]+" is a perfect number found at index "+i);
			}
			else {
				System.out.println(arr[i]+" is not a perfect number");
			}
		}
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		PerfectNumber obj = new PerfectNumber();
		obj.isPerfectNumber(arr);
	}
}
