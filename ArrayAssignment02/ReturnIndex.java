package ArrayAssignment02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReturnIndex {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter element to search : ");
		int element = Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("Index of "+element+" is : "+i);
			}
		}
	}
}
