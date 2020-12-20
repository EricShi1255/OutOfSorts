import java.util.Arrays;
import java.util.Random;
public class SortTester {

    public static boolean isSorted(int[] data) {
        //test if it is sorted
        boolean sorted = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i-1]) {
                return false;
            } 
        }
        return true;
    }
    public static void main(String args[]) {
        int[] A = {3, 7, 5, 9};
        //Sorts.bubbleSort(A);
        Sorts.selectionSort(A);
        System.out.println("{3, 7, 5, 9} --> " + Arrays.toString(A));
        int[] B = {-3, 0, 2, 5, 7, 9};
        //Sorts.bubbleSort(B);
        Sorts.selectionSort(B);
        System.out.println("{-3, 0, 2, 5, 7, 9} --> " + Arrays.toString((B)));
        int[] C = {};
        //Sorts.bubbleSort(C);
        Sorts.selectionSort(C);
        System.out.println("{} --> " + Arrays.toString((C)));
        int[] D = {5, 4, 3, 2, 1};
       // Sorts.bubbleSort(D);
        Sorts.selectionSort(D);
        System.out.println("{5, 4, 3, 2, 1} --> " + Arrays.toString((D)));
        int[] E = {2, 2, 3, 4, 3, 4, 5, 5};
        //Sorts.bubbleSort(E);
        Sorts.selectionSort(E);
        System.out.println("{2, 2, 3, 4, 3, 4, 5, 5} --> " + Arrays.toString((E)));

        //Random sorter
        int size = 20;
        int[] randomarray = new int [size];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            int random = r.nextInt(100);
            randomarray[i] = random;
        }
        System.out.println("Random Array unsorted: " + Arrays.toString(randomarray));
        Sorts.bubbleSort(randomarray);
        System.out.println("Random Array sorted: " + Arrays.toString(randomarray));
        System.out.println("Is the Array sorted: " + isSorted(randomarray));
            


    
    }
}