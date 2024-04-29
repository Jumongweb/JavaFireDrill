public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
    public static String isPalindrome(String word){
        boolean isPalindrome = true;
        for (int count = 0; count < word.length() / 2; count++){
            if (word.charAt(count) != word.charAt(word.length() - 1 - count)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            return "yes";
        } else {
            return "no";
        }

    }
}
