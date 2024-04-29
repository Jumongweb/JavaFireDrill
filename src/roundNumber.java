//import java.util.ArrayList;
//import java.util.List;
//
//    public class roundNumber {
//        public static void main(String[] args) {
//            List<Integer> numbers = new ArrayList<>();
//            numbers.add(5);
//            numbers.add(7);
//            numbers.add(10);
//            numbers.add(3);
//
//            int lastIndex = numbers.size() - 1;
//            int lastValue = numbers.get(lastIndex);
//            numbers.remove(lastIndex);
//            int newIndex = (lastIndex - 1) % numbers.size();
//            numbers.set(newIndex, numbers.get(newIndex) + lastValue);
//
//            if (numbers.get(newIndex) == 10) {
//                numbers.set(newIndex, 0);
//                int nextIndex = (newIndex + 1) % numbers.size();
//                numbers.set(nextIndex, numbers.get(nextIndex) + 1);
//            }
//
//            System.out.println("Updated list: " + numbers);
//        }
//    }
//
//}
