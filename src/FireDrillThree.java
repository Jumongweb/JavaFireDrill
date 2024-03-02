import java.util.ArrayList;
import java.util.Scanner;

public class FireDrillThree {

    private static int[] score = new int[10];
    static final Scanner scanner = new Scanner(System.in);


    public int[] taskOne(int... numbers){
        for (int index = 0; index < score.length; index++ ){
            score[index] = numbers[index];
        }
        return score;
    }
    public String taskTwo(int... numbers){
        String merge = "";
        for (int index = 0; index < score.length; index++ ){
            score[index] = numbers[index];
            merge += score[index] + "\n";
        }
        return merge;
    }

    public String taskThree(int... numbers ){
        String merge = "";
        for (int index = 0; index < score.length; index++ ){
            score[index] = numbers[index];
            merge += score[index] + " ";
        }
        return merge;
    }
    public int[] taskFour(int[] array){
        int length;
        if (array.length % 2 == 1){
            length = (array.length / 2) + 1;
        }
        else {
            length = array.length / 2;
        }
        int[] evenIndexArray = new int[length];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 0){
                    evenIndexArray[count] = array[index];
                    count++;
            }
        }
        for (int number : evenIndexArray){
            System.out.println(number);
        }

        return evenIndexArray;
    }

    public int[] taskFive(int[] array) {
        int length;
        if (array.length % 2 == 1){
            length = (array.length / 2) + 1;
        }
        else {
            length = array.length / 2;
        }
        int[] oddIndexArray = new int[length];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 1){
                oddIndexArray[count] = array[index];
                count++;
            }
        }
        for (int number : oddIndexArray){
            System.out.println(number);
        }

        return oddIndexArray;
    }

    public int taskSix(int[] array){
        int sum = 0;
        int length = array.length;
        if (array.length % 2 == 1){
            length = (array.length / 2) + 1;
        }
        else {
            length = array.length / 2;
        }
        int[] evenIndexArray = new int[length];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 0){
                evenIndexArray[count] = array[index];
                sum += evenIndexArray[count];
                count++;
            }
        }

        return sum;
    }

    public int taskSeven(int[] array) {
        int sum = 0;
        int[] oddIndexArray = new int[array.length / 2];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 1){
                oddIndexArray[count] = array[index];
                sum += oddIndexArray[count];
                count++;
            }
        }

        return sum;
    }

    public int taskEight(int[] array){
        int length = array.length;
        if (array.length % 2 == 1){
            length = (array.length / 2) + 1;
        }
        else {
            length = array.length / 2;
        }
        int[] evenIndexArray = new int[length];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 0){
                evenIndexArray[count] = array[index];
                count++;
            }
        }
        int miniumum = evenIndexArray[0];
        for (int i : evenIndexArray) {
            if (i < miniumum) {
                miniumum = i;
            }
        }
        return miniumum;
    }

    public int taskNine(int[] array){
        int[] oddIndexArray = new int[array.length / 2];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 1){
                oddIndexArray[count] = array[index];
                count++;
            }
        }
        int miniumum = oddIndexArray[0];
        for (int i : oddIndexArray) {
            if (i < miniumum) {
                miniumum = i;
            }
        }
        return miniumum;
    }

    public int taskTen(int[] array){
        int length = array.length;
        if (array.length % 2 == 1){
            length = (array.length / 2) + 1;
        }
        else {
            length = array.length / 2;
        }
        int[] evenIndexArray = new int[length];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 0){
                evenIndexArray[count] = array[index];
                count++;
            }
        }
        int maximum = evenIndexArray[0];
        for (int i : evenIndexArray) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    public int taskEleven(int[] array){
        int[] oddIndexArray = new int[array.length / 2];
        int count = 0;
        for (int index = 0; index < array.length; index++){
            if (index % 2 == 1){
                oddIndexArray[count] = array[index];
                count++;
            }
        }
        int maximum = oddIndexArray[0];
        for (int i : oddIndexArray) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    public int[] taskTwelve(int[] originalArray) {
        return originalArray;
    }

//    public int[] taskTwelve(int[] array) {
//
//    }


//    public static void main(String[] args) {
//        int[] originalArray = {10,2,3,1,4,5,6,7};
//        FireDrillThree fireDrillThree = new FireDrillThree();
//        fireDrillThree.taskTwelve(originalArray);
//    }
}