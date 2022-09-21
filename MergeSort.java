package com.bridgelab.algorithmprograms;

public class MergeSort {

	public static void main(String[] args) {
		String[] stringArray = { "one", "two", "four", "five", "six", "seven", "eight", "nine" };
		mergeSort(stringArray);
		for (String string : stringArray) {
			System.out.println(string);
		}
	}
/**
 * 
 * @param string
 */
	public static void mergeSort(String[] string) {
/*
 * 
 */
		if (string.length > 1) {
			String[] leftString = new String[string.length / 2];
			String[] rightString = new String[string.length - string.length / 2];
			for (int i = 0; i < leftString.length; i++) {
				leftString[i] = string[i];
			}
			for (int j = 0; j < rightString.length; j++) {
				rightString[j] = string[j + string.length / 2];
			}
			mergeSort(leftString);
			mergeSort(rightString);
			merge(string, leftString, rightString);
		}
	}
/**
 * 
 * @param stringArray
 * @param leftString
 * @param rightString
 */
	public static void merge(String[] stringArray, String[] leftString, String[] rightString) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (b >= rightString.length
					|| (a < leftString.length && leftString[a].compareToIgnoreCase(rightString[b]) < 0)) {
				stringArray[i] = leftString[a];
				a++;
			} else {
				stringArray[i] = rightString[b];
				b++;
			}
		}
	}

}
