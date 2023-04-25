package ArrayAssignment02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergArrays {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array-1 Size : ");
		int size1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[size1];
		
		System.out.println("Enter First Array : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Array-2 Size : ");
		int size2 = Integer.parseInt(br.readLine());
		int arr2[] = new int[size2];
		
		System.out.println("Enter Second Array : ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=Integer.parseInt(br.readLine());
		}

        int[] result = new int[size1 + size2];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[size1+i] = arr2[i];
        }

        System.out.println("Merged Array is : ");
        for(int i=0;i<result.length;i++) {
        	System.out.println(result[i]);
        }
	}
}
