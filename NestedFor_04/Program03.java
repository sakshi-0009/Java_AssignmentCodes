package NestedFor_04;

public class Program03 {

	public static void main(String[] args) {
		int row=4;
		int num=10;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
			num++;
		}
	}
}
