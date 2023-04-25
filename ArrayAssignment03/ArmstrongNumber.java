package ArrayAssignment03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	void isArmstrongNumber(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int n = arr[i];
			int temp = n;
			int sum = 0;
			int mult = 1;
			int count = 0;
			while(temp!=0) {
				count++;
				temp = temp/10;
			}
			while(n!=0) {
				int rem = n%10;
				for(int j=1;j<=count;j++) {
					mult = mult*rem;
				}
				sum = sum+mult;
				n=n/10;
			}
			if(sum==arr[i]) {
				System.out.println(arr[i]+" is armstrong number found at index "+i);
			}
			else {
				System.out.println(arr[i]+" is not armstrong number");
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
		ArmstrongNumber obj = new ArmstrongNumber();
		obj.isArmstrongNumber(arr);
	}
}