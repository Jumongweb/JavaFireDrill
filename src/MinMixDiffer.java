public class MinMixDiffer {
    public static int[] getDifference(int[] array){
        int[] newArray = new int[1];
        int largest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int count = 0; count < array.length; count++){
            if (array[count] > largest){
                largest = array[count];
            }
            if (array[count] < lowest){
                lowest = array[count];
            }
        }
        newArray[0] = largest - lowest;
        return newArray;
    }

}
