package NestedFor_05;

import java.io.*;

public class Program_05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		int a=0;
		int b=1;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				int c = a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}
