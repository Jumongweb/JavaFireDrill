package dietel_c14;

public class DataValidator {

//    public static boolean isPhoneNumberValid(String phoneNumber) {
//        return phoneNumber.length() == 11 || isPhoneNumberWithValidAreacode(phoneNumber);
//    }
//
//    public static boolean isPhoneNumberWithValidAreacode(String phoneNumber){
//        return phoneNumber.startsWith("+234");
//    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        String regex = "((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
        return phoneNumber.matches(regex);
    }

    public static boolean isEmailValid(String email) {
        //String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String regex = "[a-z].[a-z]+@(enum|semicolon|learnspace|native.semicolon).africa";

        return email.matches(regex);
    }
}
