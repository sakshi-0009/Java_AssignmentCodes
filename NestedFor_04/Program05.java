package NestedFor_04;

public class Program05 {

	public static void main(String[] args) {
		int row=4;
		char ch='A';
		char ch1=ch;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i+1;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			ch1++;
		}
	}
}
