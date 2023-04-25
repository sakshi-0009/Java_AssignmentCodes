package NestedFor_03;

public class Program7 {

	public static void main(String[] args) {
		char ch='F';
		for(int i=1;i<=6;i++) {
			char ch1=ch;
			for(int j=1;j<=i;j++) {
				System.out.print(ch1++ +" ");
			}
			System.out.println();
			ch--;
		}
	}
}
