package NestedFor_02;

public class Program8 {

	public static void main(String[] args) {
		char ch1='A';
		char ch2='b';
		
		for(int i=1; i<=4; i++) {

			for(int j=1; j<=4 ;j++) {
				if(j%2==1) {
					System.out.print(ch1 +" ");
					ch1=(char) (ch1 + 2);

				}
				else {
					System.out.print(ch2 +" ");
					ch2=(char) (ch2 + 2);
				}
			}
			System.out.println();
		}
	}
}
