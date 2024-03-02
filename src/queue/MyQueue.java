package queue;

public class MyQueue <T>{
    private static boolean isEmpty = true;
    private int numberOfElement;
    private T[] elements;

    public MyQueue(int capacity){
        elements = (T[]) new Object[capacity];
    }
    public boolean isEmpty() {
        //if (elements.length > 0) isEmpty = false;
        //return isEmpty;
        return numberOfElement == 0;
    }

    public void add(T element) {
        numberOfElement++;
        elements[numberOfElement] = (T) element;
    }

    public int size(){
        return numberOfElement;
    }
}