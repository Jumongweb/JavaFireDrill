package mySet;

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

    public void addAll(String... element) {
        int count = 0;
        for (String value : element){
            count++;
        }

        for (int index = noOfElement; index < noOfElement + count; index++){
            elements[index] = element[index];
            System.out.println(index);
        }
        noOfElement += count;
    }

    public void addAll2(String... element) {
        boolean hasElement = false;
        for (int i = noOfElement, j = noOfElement; i < noOfElement + element.length; i++, j++){
            if (elements[i].equals(element[i])){
                hasElement = true;
            }
            if (!hasElement){
                elements[j] = element[j];
                noOfElement++;
            }
            else {
                j--;
            }
        }
    }

    public String[] displaySet(){
        String[] newArray = new String[noOfElement];

        for (int i = 0; i < noOfElement; i++){
            System.out.print(elements[i] + " ");
        }
        return elements;
    }

    public void resizeSet(){
        if (elements.length == noOfElement){
            String[] newArray = new String[noOfElement + 5];
            for (int i = 0; i < elements.length; i++){
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }


    public void clear() {
        String[] newArray = new String[5];
        noOfElement = 0;
        elements = newArray;
    }
}
