package generics;

public class GenericsDriver {
    public static void main(String[] args) {
        GenericExample<Integer> genericExample1 = new GenericExample<>(5);
        GenericExample<String> genericExample2 = new GenericExample<>("I am a String");
        GenericExample<Double> genericExample3 = new GenericExample<>(43.3);
        System.out.println(genericExample1.getPrintedStuff());
        System.out.println(genericExample2.getPrintedStuff());
        System.out.println(genericExample3.getPrintedStuff());

        GenericTwo<String, Integer> genericTwo = new GenericTwo<>("Love", 911);
        genericTwo.print();

        GenericExample.getGeneric("India");
        GenericExample.getGeneric(5);
        GenericExample.getGeneric(4.4);
        GenericExample.getGeneric(true);
        GenericExample.getGeneric(3f);
        GenericExample.getGeneric(34L);

        GenericExample.getGenericFunction("Lover");
    }

}
