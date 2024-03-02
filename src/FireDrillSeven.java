import java.util.Arrays;

public class FireDrillSeven {
    public boolean[] arrayToBinary(int[] array) {
        boolean[] newArray = new boolean[array.length];
        System.out.println("input" + Arrays.toString(array));
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                newArray[index] = false;
            } else {
                newArray[index] = true;
            }
        }
        System.out.println("Result" + Arrays.toString(newArray));
        return newArray;
    }

    public boolean[] convertToBinaryWithTernary(int[] value) {
        boolean[] newArray = new boolean[value.length];
        for (int index = 0; index < value.length; index++) {
            newArray[index] = value[index] % 2 == 0 ? false : true;
        }
        return newArray;
    }

    public boolean[] covertThirdChance(int[] value) {
        boolean[] newArray = new boolean[value.length];
        for (int i = 0; i < value.length; i++) {
            newArray[i] = value[i] != 0;
        }
        return newArray;
    }

    public boolean[] covertFourthChance(int[] value) {
        boolean[] newArray = new boolean[value.length];

        for (int index = 0; index < value.length; index++) newArray[index] = value[index] == 0;
        return newArray;
    }
}