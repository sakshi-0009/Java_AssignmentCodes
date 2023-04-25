package NestedFor_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_10 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start and End : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		
		for(int i=start;i<=end;i++) {
			int count = 0;
			for(int j=1;j*j<i;j++) {
				if(i%j==0) {
					count=count+2;
				}
				if(count>2) {
					break;
				}
			}
			if(count<=2 && i != 1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
