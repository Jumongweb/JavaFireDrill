import java.util.Arrays;

public class FireDrillFive {
    public int[] doubleMyArray(int[] array){
        int[] newArray = new int[array.length * 2];

        for (int count = 0; count < array.length; count++){
                newArray[count] = array[count];
                newArray[array.length + count] = array[count] * 2;
               // newArray[array.length + count] = array[count] * 2;

        }
        return newArray;
    }

    public int[] secondTry(int[] array){
        int[] newArray = new int[array.length * 2];
        int index = 0;
        for (int count = 0; count < newArray.length; count++){
            if (count < array.length){
                newArray[count] = array[count];
                continue;
            }
            newArray[count] = array[index] * 2;
            index++;
        }
        return newArray;
    }

}
