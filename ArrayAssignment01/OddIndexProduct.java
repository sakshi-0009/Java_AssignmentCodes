package ArrayAssignment01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddIndexProduct {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int odd=1;
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
			odd=odd*arr[i];
			}
		}
		System.out.println("The product of odd index elements in the array is : "+odd);
	}
}
