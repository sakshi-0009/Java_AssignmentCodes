package NestedFor_02;

public class Program2 {

	public static void main(String[] args) {
		int num=13;
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4 ;j++) {
				System.out.print((j+num)+" ");
			}
			System.out.println();
			num++;
		}
	}
}
