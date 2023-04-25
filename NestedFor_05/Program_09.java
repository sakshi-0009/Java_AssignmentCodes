package NestedFor_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_09 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br.readLine());
		int n = num;
		int x = 0;
		
		while(n!=0) {
			int rem = n%10;
			int mult = 1;
			while(rem!=0) {
				mult = mult*rem;
				rem--;
			}
			x = x+mult;
			n = n/10;
		}
		System.out.println("Addition of factorial of each digit from "+num+" is : "+x);
	}
}
