package NestedFor_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program09 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Strong numbers between "+start+" to "+end+" are : ");
		for(int i=start;i<=end;i++) {
			int n = i;
			int sum = 0;
			while(n!=0) {
				int rem = n%10;
				int fact = 1;
				
				for(int j=1;j<=rem;j++) {
					fact = fact*j;
				}
				sum = sum+fact;
				n = n/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
