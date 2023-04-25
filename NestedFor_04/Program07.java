package NestedFor_04;

public class Program07 {

	public static void main(String[] args) {
		int row=6;
		int num=1;
		char ch='F';
		for(int i=1;i<=row;i++) {
			char ch1=ch;
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(num++ +" ");
				} else {
					System.out.print(ch1++ +" ");
				}
			}
			System.out.println();
			ch--;
		}
	}
}
