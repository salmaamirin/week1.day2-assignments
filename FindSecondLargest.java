package wee1.day2;

import java.util.Arrays;

public class FindSecondLargest {


	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		int length=data.length;
		Arrays.sort(data);
		System.out.println("Sorted array");
		for(int i=0;i<length;i++)
			System.out.println(data[i]);
		
		
		System.out.println("Second largest array " + data[length-2]);
		
		
		// TODO Auto-generated method stub

	}

}
