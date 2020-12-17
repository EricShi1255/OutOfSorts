import java.util.Arrays;
public class SortTester {
    public static void main(String args[]) {
        int[] A = {3, 7, 5, 9};
        Sorts.bubbleSort(A);
        System.out.println("{3, 7, 5, 9} --> " + Arrays.toString(A));
        int[] B = {-3, 0, 2, 5, 7, 9};
        Sorts.bubbleSort(B);
        System.out.println("{-3, 0, 2, 5, 7, 9} --> " + Arrays.toString((B)));
    }
}