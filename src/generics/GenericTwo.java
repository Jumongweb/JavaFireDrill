package generics;

public class GenericTwo <T, U>{
    T obj1;
    U obj2;
    public GenericTwo(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
