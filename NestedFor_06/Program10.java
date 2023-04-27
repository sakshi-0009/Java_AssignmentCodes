package NestedFor_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program10 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Armstrong numbers between "+start+" to "+end+" are : ");
		for(int i=start;i<=end;i++) {
			int n = i;
			int temp = n;
			int sum = 0;
			int count = 0;
			while(temp!=0) {
				count++;
				temp = temp/10;
			}
			while(n!=0) {
				int mult = 1;
				int rem = n%10;
				for(int j=1;j<=count;j++) {
					mult = mult*rem;
				}
				sum = sum+mult;
				n=n/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
