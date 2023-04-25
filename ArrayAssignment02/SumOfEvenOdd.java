package ArrayAssignment02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfEvenOdd {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum1 = sum1+arr[i];
			}
			else {
				sum2 = sum2+arr[i];
			}
		}
		System.out.println("Even numbers sum = "+sum1);
		System.out.println("Odd numbers sum = "+sum2);
	}
}
