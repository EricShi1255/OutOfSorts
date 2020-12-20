public class Sorts{
    /**Bubble sort of an int array. 
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */
    public static void bubbleSort(int[] data) {
      boolean prevListSwap = true;
      while (prevListSwap && (data.length != 0)) {
        boolean swapped = false; 
        for (int i = 0; i < data.length-1; i++) {   
          if (data[i] > data[i+1]) {
            int curr = data[i];
            int next = data[i+1];
            data[i] = next;
            data[i+1] = curr;
            swapped = true;
          }
        }
        if (!swapped) {
          prevListSwap = false;
        }
      }
    }
    public static void selectionSort(int[] data){
      for (int i = 1; i < data.length-1; i++) {
        int min = data[i];
        int minpos = i;
        int j;
        //find the min
        for (j = i; j < data.length-1; j++) {
          if (data[j] < min) {
            min = data[j];
            minpos = j;

          }
        }
      //send min to the front
      int temp = data[i];
      data[i] = j;
      data[minpos] = temp;
      }
    }
}