package ArrayAssignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenProduct {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int product=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			product=product*arr[i];
			}
		}
		System.out.println("The sum of odd elements in the array is : "+product);
	}
}
