package NestedFor_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program07 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Palindrome numbers between "+start+" to "+end+" are : ");
		for(int i=start;i<=end;i++) {
			int rev = 0;
			int n = i;
			while(n != 0){
				int rem = n%10;
				rev = rev*10+rem;
				n = n/10;
			}
			System.out.println(rev);
		}
	}
}
