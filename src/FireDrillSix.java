import java.util.Arrays;

public class FireDrillSix {
    public int[] arrayToBinary(int[] array){
        System.out.println("input" + Arrays.toString(array));
        for (int index = 0; index < array.length; index++){
            if (array[index] % 2 == 0){
                array[index] = 0;
            }
            else {
                array[index] = 1;
            }
        }
        System.out.println("Result" + Arrays.toString(array));
        return array;
    }

    public int[] convertToBinaryWithTernary(int[] value){
        for (int index = 0; index < value.length; index++){
            value[index] = value[index] % 2 == 0 ? 0 : 1;
        }
        return value;
    }

}
