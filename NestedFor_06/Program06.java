package NestedFor_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program06 {

public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 5 numbers : ");
		
		for(int i=1;i<=5;i++) {
			int n1 = Integer.parseInt(br.readLine());
			int count = 0;
			int num = n1;
			while(n1 !=0) {
				n1 = n1/10;
				count++;
			}
			System.out.println("Digit count in "+num+" is : "+count);
		}
	}
}
