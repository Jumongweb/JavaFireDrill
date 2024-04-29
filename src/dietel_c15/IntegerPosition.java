package dietel_c15;

import java.util.Arrays;

public class IntegerPosition {

    public static void main(String[] args) {
        int[] array = {2,3,3,3,6,7};
        System.out.println(Arrays.toString(getPosition(array)));
    }

    public static int[] getPosition(int[] array){
        int[] positions = new int[array.length];
        //sortInteger(positions);
        for (int count = 0; count < array.length; count++){
            for (int counter = 0; counter < array.length; counter++){
                if (array[count] == array[counter]){
                    positions[count] = counter;
                }
            }
        }
        return array;
    }

    public static int[] sortInteger(int[] array){
        int temp = 0;
        for (int count = 0; count < array.length; count++){
            for (int counter = count + 1; counter < array.length; counter++){
                if (array[count] > array[counter]){
                    temp = array[count];
                    array[count] = array[counter];
                    array[counter] = temp;
                }
            }
          }
        return array;
    }

}


