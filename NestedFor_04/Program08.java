package NestedFor_04;

public class Program08 {

	public static void main(String[] args) {
		int row=4;
		int num=10;
		char ch='J';
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
					System.out.print(num +" ");
				} else {
					System.out.print(ch +" ");
				}
				num--;
				ch--;
			}
			System.out.println();
			
		}
	}
}
