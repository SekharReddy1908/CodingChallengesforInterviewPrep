// You are given an integer array nums consisting of n elements, and an integer k.
// nums = [1,12,-5,-6,50,3], k = 4
// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
// Any answer with a calculation error less than 10-5 will be accepted.

public class FindMaxAverage {
    public static void main(String[] args) {
        int[] differences = { 1, 12, -5, -6, 50, 3 };
        double rvalue = findMaxAverage(differences, 4);
        System.out.println("FindMaxAverage Value:" + rvalue);
    }

    static double findMaxAverage(int[] arr, int k) {
        int i = 0, j = 0;
        int n = arr.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        while (i < n) {
            sum += arr[i];
            if (i - j + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[j];
                j++;
            }
            i++;
        }
        return (double) maxSum / k;
    }
}
