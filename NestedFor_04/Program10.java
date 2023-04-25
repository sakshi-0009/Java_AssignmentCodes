package NestedFor_04;

public class Program10 {

	public static void main(String[] args) {
		int row=4;
		int num=1;
		for(int i=1;i<=row;i++) {
			num=i;
			for(int j=1;j<=i;j++) {
				if(num%2==0) {
					System.out.print(num*num*num +" ");
				} else {
					System.out.print(num*num +" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
