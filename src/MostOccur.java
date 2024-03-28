public class MostOccur {
    public static int[] getHighestOccur(int[] array){
        int[] result = new int[2];
        int largest = 0;
        int number = 0;
        for (int i = 0; i < array.length; i++){
            int counter = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    counter++;
                }
            }
            if (counter > largest){
                largest = counter;
                number = array[i];
            }
        }
        result[0] = largest;
        result[1] = number;
        return result;
    }

}
