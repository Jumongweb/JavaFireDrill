import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] testArray = {6,9,3,1,8};
        System.out.println(Arrays.toString(sortArray(testArray)));
    }

    public static int[] sortArray(int[] array) {
        Boolean swapped = true;

//        while(swapped) {
//            swapped = false;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    swapped = true;
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                }
//            }
//        }

        boolean swap = true;
        do {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        } while (swapped);

        return array;
    }

}
