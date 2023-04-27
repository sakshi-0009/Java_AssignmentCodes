package NestedFor_06;

import java.io.*;

public class Program04 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end: ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.println("Perfect cubes between "+start+" to "+end+" are : ");
		for(int i = start; i<=end;i++) {
			while(i*i*i<=end) {
			System.out.println(i*i*i);
			i++;
			}
		}
	}
}
