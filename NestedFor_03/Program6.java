package NestedFor_03;

public class Program6 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int num=9;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
