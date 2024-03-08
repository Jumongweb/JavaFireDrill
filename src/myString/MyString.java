package myString;

public class MyString {
    private char[] stringChars;
    public MyString(char... chars) {
        stringChars = chars;
    }

    @Override
    public String toString(){
        String string = "";
        for (char letter : stringChars){
            string += letter;
        }

        return string;
    }

//    @Override
//    public boolean equals(MyString other){
//        MyString myString = (MyString) other;
//        for (int i = 0; i < stringChars.length; i++){
//            if (stringChars[i] != myString[i]) return false;
//        }
//        return true;
//    }

}
