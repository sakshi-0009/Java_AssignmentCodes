package NestedFor_01;

public class Program13 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			int num=1;
			char ch='A';
			for(int j=1;j<=4;j++) {
				if(j%2==1) {
					System.out.print(ch+" ");
				}else {
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}
	}
}
