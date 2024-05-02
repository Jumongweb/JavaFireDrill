import java.util.Arrays;

public class Position {
    public static void main(String[] args) {
        int[] array = {8,10,4};
        System.out.println(Arrays.toString(getPosition(array)));
    }

    public static int[] getPosition(int[] array){
        int[] positionArray = new int[array.length];
        int[] inputArray = copyArray(array);
        int[] sortedArray = sortArray(array);
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.toString(sortedArray));
        for (int index = 0; index < inputArray.length; index++){
            int count = 0;
            for (int index2 = 0; index2 < sortedArray.length; index2++){
                count++;
                if (inputArray[index] == sortedArray[index2]){
                    positionArray[index] = count;
                    break;
                }
            }
        }
        return positionArray;
    }

    public static int[] sortArray(int[] array){
        for (int i = 0; i < array.length; i++){
            int temp = 0;
            for (int j = i + 1 ; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] copyArray(int[] array){
        int[] newArray = new int[array.length];
        for (int count = 0; count < array.length; count++) {
            newArray[count] = array[count];
        }
        return newArray;
    }
}
