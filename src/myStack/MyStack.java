package myStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
    private int capacity;
    private int noOfElement;
    private String[] elements;
    private boolean isFull = false;
    //public boolean isEmpty = true;

    public MyStack(int capacity) {
        this.capacity = capacity;
        elements = new String[capacity];
    }

    public boolean isEmpty(){ return noOfElement == 0; }

    public int getSize(){
        return noOfElement;
    }
    public void push(String value) {
        if (isFull()){
            throw new StackOverflowError();
        }
        else{
            elements[noOfElement] = value;
            noOfElement++;
        }
    }

    public String pop() {
        if (noOfElement <= 0){
            throw new EmptyStackException();
        }
        String poppedElement = elements[noOfElement - 1];
        elements[noOfElement - 1] = null;
        noOfElement--;

        return poppedElement;
    }
    public String[] displayStack(){
        String[] newArray = new String[noOfElement];
        for (int i = 0; i < noOfElement; i++){
            newArray[i] = elements[i];
        }
        elements = newArray;
        return elements;
    }

    public String peek() {
        if (noOfElement == 0){
            throw new EmptyStackException();
        }
        return elements[noOfElement - 1];
    }
    public boolean isFull(){
        if (noOfElement == capacity){
            isFull = true;
        }
        return isFull;
    }
}
