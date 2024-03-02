package myArrayList;

import java.util.Arrays;
import java.util.Stack;

public class MyArrayList {
    private boolean isEmpty = true;
    private  String[] elements = new String[5];

    private int numberOfElement;

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void add(String element) {
            if (elements.length == numberOfElement){
                String[] newArray = new String[numberOfElement + 5];
                for (int i = 0; i < elements.length; i++){
                    newArray[i] = elements[i];
                }
                newArray[numberOfElement] = element;
                numberOfElement++;
                elements = newArray;
            }

        else
        {
            elements[numberOfElement] = element;
            numberOfElement++;
        }
    }
    public void getItems(){
        for (int i = 0; i < numberOfElement; i++){
            System.out.println(elements[i]);
        }
    }

    public String get(int i) {
        for (int index = 0; index < elements.length; index++){
            return elements[i];
        }
        return "0";
    }

    public void remove(String element) {
        String[] newArray = new String[numberOfElement - 1];
        int temp = 0;
        for (int i = 0; i < numberOfElement; i++){
            if (element.equals(elements[i])){
                continue;
            }
            newArray[temp] = elements[i];
            temp++;
        }
        numberOfElement--;
        elements = newArray;
    }

    public int size() {
        return numberOfElement;
    }

    public String[] display(){
        return elements;
    }

    public void removeIndex(int index) {
        String[] newArray = new String[numberOfElement - 1];
        int temp = 0;
        for (int count = 0; count < numberOfElement; count++){
            if (count == index){
                continue;
            }
            newArray[temp] = elements[count];
            temp++;
        }
        numberOfElement--;
        elements = newArray;
    }

    public void insert(int index, String element) {
        String[] newArray = new String[numberOfElement + 1];
        for (int i = 0, j = 0; i < newArray.length; i++, j++){
            if (i == index){
                newArray[i] = element;
                j--;
            }
            else {
                newArray[i] = elements[j];
            }
        }
        System.out.println(Arrays.toString(newArray));
        elements = newArray;
    }

    public void displayArray(){
        for(int i = 0; i < numberOfElement; i++){
            System.out.println(elements[i]);
        }
    }
}
