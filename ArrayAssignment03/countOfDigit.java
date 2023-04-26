package ArrayAssignment03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countOfDigit {

	void digitCount(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			int count = 0;
			while(n!=0) {
				count++;
				n = n/10;
			}
			System.out.println("Count of digit in elements of the array is : "+count);
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
		countOfDigit obj = new countOfDigit();
		obj.digitCount(arr);
	}
}
