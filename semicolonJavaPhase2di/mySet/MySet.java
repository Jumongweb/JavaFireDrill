package semicolonJavaPhase2di.mySet;

import java.util.Arrays;

public class MySet {

    private int noOfElement;
    private String[] elements = new String[5];
    public boolean isEmpty() {
       return noOfElement == 0;
    }

    public void add(String element) {
        boolean hasElement = false;
        for (int index = 0; index < noOfElement; index++){
            if (elements[index].equals(element)){
                hasElement = true;
            }
        }
        if (!hasElement){
            elements[noOfElement] = element;
            noOfElement++;
        }
    }
    public void remove(String element){
        boolean hasElement = false;

        for (int index = 0; index < noOfElement; index++){
            if (elements[index].equals(element)){
                hasElement = true;
                break;
            }
        }
        if (hasElement){
            String[] newArray = new String[noOfElement - 1];
            int temp = 0;
            for (int i = 0; i < noOfElement; i++) {
                if (element.equals(elements[i])) {
                    continue;
                }

                newArray[temp] = elements[i];
                temp++;
            }
            if (temp < noOfElement) {
                noOfElement--;
            }
            elements = newArray;
            System.out.println(Arrays.toString(elements));
        }
        else {
            throw new NullPointerException(element + " does not exist");
        }
    }

    public int size() {
        return noOfElement;
    }

    public boolean contain(String element) {
        for (String value : elements){
            if (value.equals(element)){
                return true;
            }
            else {
                throw new NullPointerException("Element does not exist");
            }

        }
        return false;
    }
}
