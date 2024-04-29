import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MoveZero {

    public int countZero(int[] array){
        int count = 0;
        for (int j : array) {
            if (j == 0) count++;
        }
        return count;
    }
    public int[] getArray1(int[] array){
        int[] newArray = new int[array.length];
        int count = countZero(array);
        int zeroIndex = array.length - count;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < count; j++) {
              //  if()
            }

//                if (array[i] == 0){
//                    newArray[zeroIndex] = array[i];
//                    zeroIndex++;
//                }
//                else{
//                    newArray[i] = array[i];
//                }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public int[] getArray(int[] input) {
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                input[index++] = input[i];
            }
        }
        while (index < input.length) {
            input[index++] = 0;
        }
        return input;
    }
}
