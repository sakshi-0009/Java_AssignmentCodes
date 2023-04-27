package NestedFor_06;

import java.io.*;

public class Program02 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start : ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter End : ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Composite numbers between "+start+" to "+end+" are : ");
		for(int i=start; i<=end; i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count>2) {
				System.out.println(i);
			}
		}
	}
}