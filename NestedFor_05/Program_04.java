package NestedFor_05;

import java.io.*;

public class Program_04 {

public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start and End : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		
		for(int i=end;i>=start;i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for(int i=start;i<=end;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}

