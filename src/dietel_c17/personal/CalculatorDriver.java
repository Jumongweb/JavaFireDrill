package dietel_c17.personal;

public class CalculatorDriver {
    public static void main(String[] args) {
        System.out.println(calculatorOps(Integer::sum,6,7));
        System.out.println(calculatorOps((a, b)-> a * b, 4,9));
    }

    public static int calculatorOps(Calculator calculator, int x, int y){
        return calculator.calculate(x, y);
    }

}
