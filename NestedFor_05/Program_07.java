package NestedFor_05;

import java.io.*;

public class Program_07 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number of rows : ");
		int rows = Integer.parseInt(br.readLine());
		
		int x =(rows*(rows+1))/2;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if((i%2==1 && rows%2==1) || (i%2==0 && rows%2==0)) {
					System.out.print((char)(64+x)+" ");
				}
				else {
					System.out.print(x+" ");
				}
				x--;						
			}
			System.out.println();
		}
	}
}
