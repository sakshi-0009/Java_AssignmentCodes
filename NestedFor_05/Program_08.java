package NestedFor_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_08 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(i%4==1) {
					System.out.print("$ ");
				}
				else if(i%4==2) {
					System.out.print("@ ");
				}
				else if(i%4==3) {
					System.out.print("& ");
				}
				else {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
