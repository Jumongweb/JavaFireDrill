package generics;

public class GenericExample<T> {
    private T printSomething;

    public GenericExample(T something){
        this.printSomething = something;
    }

    public T getPrintedStuff(){
        return printSomething;
    }

    public static <T>  void getGeneric(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static <T> void getGenericFunction(T parameter){
        System.out.println("Another " + parameter.getClass().getName() + " " + parameter);
    }

}
