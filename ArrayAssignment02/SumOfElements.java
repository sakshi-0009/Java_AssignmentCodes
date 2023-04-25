package ArrayAssignment02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfElements {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array elements whose addition of elements is even are : ");
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			while(temp!=0) {
				int rem = temp%10;
				sum = sum+rem;
				temp=temp/10;
			}
			if(sum%2==0) {
				System.out.println(arr[i]);
			}
			sum=0;
		}
	}
}
