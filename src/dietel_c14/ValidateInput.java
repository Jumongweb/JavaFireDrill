package dietel_c14;

public class ValidateInput {
    public static void main(String[] args) {
        System.out.println("Firstnames:  ");
        System.out.println(validateFirstName("Lawal"));
        System.out.println(validateFirstName("lawal"));
        System.out.println(validateFirstName("laWal"));
        System.out.println("==============================");
        System.out.println("Lastnames:  ");
        System.out.println(validateLastName("Toheeb"));
        System.out.println(validateLastName("toheeb"));
        System.out.println(validateLastName("ToHeeb"));
        System.out.println("==============================");

    }
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName){
        return lastName.matches(("[a-zA-z]+(['-][a-zA-Z]+)*"));
    }
}
