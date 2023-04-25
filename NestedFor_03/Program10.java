package NestedFor_03;

public class Program10 {

	public static void main(String[] args) {
		int num=1;
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
			num--;
		}
	}
}

