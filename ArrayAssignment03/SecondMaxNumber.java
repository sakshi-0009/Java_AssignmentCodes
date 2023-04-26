package ArrayAssignment03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondMaxNumber {

	void SecondMax(int arr[], int size) {
		if(size>2) {
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int n = arr[i];
						arr[i] = arr[j];
						arr[j] = n;
					}
				}
			}
		}
		System.out.println("Second Maximun number is : "+arr[arr.length-2]);
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
		SecondMaxNumber obj = new SecondMaxNumber();
		obj.SecondMax(arr,size);
	}
}
