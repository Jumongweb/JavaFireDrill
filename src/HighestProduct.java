public class HighestProduct {


    public int getHighestProduct(int[] array) {
        int highestProduct = Integer.MIN_VALUE;
        if (array.length == 0){
            return 0;
        }
        if (array.length == 1){
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] * array[j] > highestProduct) highestProduct = array[i] * array[j];
            }
        }
        return highestProduct;
    }

}
