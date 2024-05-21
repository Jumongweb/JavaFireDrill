package dietel_c17.c19.streams;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {31,2,13,4,1, 4,15,3,19,1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array){
        boolean swap = true;

        while (swap){
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                int temp = 0;
                if (array[i] > array[i + 1]){
                    swap = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }
}
