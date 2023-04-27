package NestedFor_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program01 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Start : ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter End : ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("The numbers are divisible by 5 and the numbers are even are : ");
		int count=0;
		for(int i=start;i<=end;i++) {
			if(i%5==0 && i%2==0) {
				count++;
				System.out.println(i+" ");
			}
		}
		System.out.println("count = "+count);
	}
}
