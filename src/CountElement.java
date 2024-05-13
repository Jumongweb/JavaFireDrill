import java.util.*;

public class CountElement {

    public static int[] countElement(int[] array){
        int[] inputArray = array;
        HashSet<Integer> singleElement = new HashSet<>();
        for (int count = 0; count < inputArray.length; count++){
            singleElement.add(array[count]);
        }

        Dictionary<String, Integer> output = new Hashtable<>();

        for (int counter = 0; counter < singleElement.size(); counter++) {
            int count = 0;
            for (int index = 0; index < inputArray.length; index++) {
                if (singleElement.toArray()[counter].equals(inputArray[index])){
                    count++;
                }
            }
            output.put("" + singleElement.toArray()[counter], count);
        }
        System.out.println(output);

        return inputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 1, 3};
        System.out.println(Arrays.toString(countElement(inputArray)));
    }

}
