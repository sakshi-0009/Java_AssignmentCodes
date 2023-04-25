package ArrayAssignment03;

import java.io.*;

public class PalindromeNumber {
	
	void isPalindromeNumber(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int n = arr[i];
			int rev = 0;
			while(n!=0) {
				int rem = n%10;
				rev = rev*10+rem;
				n = n/10;
			}
			if(rev == arr[i]) {
				System.out.println(arr[i]+" is a Palindrome number found at index "+i);
			}
			else {
				System.out.println(arr[i]+" is not a palindrome number");
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
		PalindromeNumber obj = new PalindromeNumber();
		obj.isPalindromeNumber(arr);	
	}
}
