// You are given a 0-indexed array of n integers differences, which describes the differences between each pair of consecutive integers of a hidden sequence of length (n + 1). More formally, call the hidden sequence hidden, then we have that differences[i] = hidden[i + 1] - hidden[i].
// You are further given two integers lower and upper that describe the inclusive range of values [lower, upper] that the hidden sequence can contain.

public class CounttheHiddenSequences {
    public static void main(String[] args) {
        int[] differences = { 3, -4, 5, 1, -2 };
        int result = numberOfArrays(differences, -4, 5);
        System.out.println("Number of possible arrays: " + result);
    }

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int x = 0, y = 0, cur = 0;
        for (int d : differences) {
            cur += d;
            x = Math.min(x, cur);
            y = Math.max(y, cur);
        }
        if (y - x > upper - lower) {
            return 0;
        }
        return (upper - lower) - (y - x) + 1;
    }
}
