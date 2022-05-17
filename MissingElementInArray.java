package wee1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int length=arr.length;
		System.out.println("Missing element");
		
		for(int i=1;i<=length;i++) {
			if(i+1!=arr[i]) {
				System.out.println(i+1);
				break;
				
			}
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
