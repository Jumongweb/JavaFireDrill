public class FireDrillTen {
    public static int[] minMax(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] newArray = {0,0};

        for (int count = 0; count < array.length; count++){
            int sum = 0;
            for(int counter = 0; counter < array.length; counter++){
                if (array[count] != array[counter]){
                    sum += array[counter];
                }
            }

            if (min > sum ) min = sum;
            if (max < sum) max = sum;

        }
        newArray[0] = min;
        newArray[1] = max;
        return newArray;
        //return String.format("The minumum is %d and the maximum is %d", min, max);
    }
}
