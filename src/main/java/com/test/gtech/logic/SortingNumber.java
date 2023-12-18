package com.test.gtech.logic;

public class  SortingNumber {

    public static int[] sortNumbers(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int temp = arr[lowestIndex];
            arr[lowestIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] numbers = {100, 53, 523, 98, 4, 7, 8, 20, 32, 90, 9872, 12};
        int[] sortNumbers = sortNumbers(numbers);
        for (int number: sortNumbers) {
           sb.append(number).append(" ");
        }
        System.out.println("sortNumbers = " + sb);
    }
}
