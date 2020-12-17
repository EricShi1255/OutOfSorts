import java.util.Arrays;
public class SortTester {
    public static void main(String args[]) {
        int[] A = {3, 7, 5, 9};
        Sorts.bubbleSort(A);
        System.out.println("{3, 7, 5, 9} --> " + Arrays.toString(A));
        int[] B = {-3, 0, 2, 5, 7, 9};
        Sorts.bubbleSort(B);
        System.out.println("{-3, 0, 2, 5, 7, 9} --> " + Arrays.toString((B)));
        int[] C = {};
        Sorts.bubbleSort(C);
        System.out.println("{} --> " + Arrays.toString((C)));
        int[] D = {5, 4, 3, 2, 1};
        Sorts.bubbleSort(D);
        System.out.println("{5, 4, 3 , 2, 1} --> " + Arrays.toString((D)));
        int[] E = {2, 2, 3, 4, 3, 4, 5, 5};
        Sorts.bubbleSort(E);
        System.out.println("{2, 2, 3, 4, 3, 4, 5, 5} --> " + Arrays.toString((E)));
    
    }
}