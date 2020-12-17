import java.util.Arrays;
public class SortTester {
    public static void main(String args[]) {
        int[] A = {3, 7, 5, 9};
        System.out.println(Arrays.toString(A));
        Sorts.bubbleSort(A);
        System.out.println(Arrays.toString(A));
    }
}