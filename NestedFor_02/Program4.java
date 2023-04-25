package NestedFor_02;

public class Program4 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			int num=1;
			char ch='A';
			for(int j=1; j<=3 ;j++) {
				System.out.print((num++) +""+ (ch++)+" ");
			}
			System.out.println();
		}
	}
}
