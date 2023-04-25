package NestedFor_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_06 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter two Characters : ");
		char ch1 = (char)br.read();
		br.skip(0);
		char ch2 = (char)br.read();
		
		if(ch1==ch2) {
			System.out.println("Two characters are same!");
		}
		else {
			int difference = ch1-ch2;
			if(difference<0) {
				difference=difference*(-1);
			}
			System.out.println("The difference between "+ch1+" and "+ch2+" is : "+difference);
		}
	}
}
