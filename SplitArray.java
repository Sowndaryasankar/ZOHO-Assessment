package org.zoho;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 1, 5};
		        splitArray(arr);
		    }

		    public static void splitArray(int[] arr) {
		        int sum = 0;
		        for (int i = 0; i < arr.length; i++) {
		            sum =sum+ arr[i]; //12
		        }

		        if (sum % 2 != 0) {//12%2=0
		         System.out.println("Cannot split array into sub arrays with equal sum.");
		         return;
		         }

		int targetSum = sum / 2; //6
		int subArrayStartIndex = 0;
		int subArrayEndIndex = 0;
		int currentSum = 0;
		for (int i = 0; i < arr.length; i++) {
		currentSum += arr[i];
		if (currentSum == targetSum) {
		    subArrayEndIndex = i;
		    System.out.print("TWO sub array: " + Arrays.toString(Arrays.copyOfRange(arr, subArrayStartIndex, subArrayEndIndex + 1)));
		    subArrayStartIndex = i + 1;
		    currentSum = 0;
		}
		}
		    }
}

