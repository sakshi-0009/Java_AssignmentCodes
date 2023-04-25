package NestedFor_02;

public class Program9 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1; i<=3; i++) {
			char ch='C';
			int n=3;
			for(int j=1; j<=3 ;j++) {
				System.out.print((num*num));
				System.out.print(ch--);
				System.out.print(n-- +" ");
				num++;
			}
			System.out.println();
		}
	}
}
