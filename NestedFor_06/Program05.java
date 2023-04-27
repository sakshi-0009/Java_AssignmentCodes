package NestedFor_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Perfect numbers between "+start+" to "+end+" are : ");
		for(int i=start;i<end;i++) {
			
			int sum = 0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
