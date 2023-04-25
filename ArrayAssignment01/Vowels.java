package ArrayAssignment01;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		
		char arr[] = new char[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
//		****** Using ForEach Loop ******
//		for(char ch : arr) {
//		    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//		        System.out.print(ch+" ");
//		        }
//		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
		        System.out.print("The Vowels from given array are : "+arr[i]+" ");
		        }
		}
		System.out.println();
	}
}
