package dietel_c16.Generic;

public class Practise <T, U>{

    private T value;
    private U value2;

    public Practise(T value, U value2) {
        this.value = value;
        this.value2 = value2;
    }

    public void getValue(){
        System.out.println(this.value);
        System.out.println(this.value2);
    }


    public static void main(String[] args) {
        Practise<Integer, Integer> number = new Practise<>(3, 4);
        number.getValue();
        Practise<String, String> myString = new Practise<>("Jumong", "catch");
        myString.getValue();

    }

}
