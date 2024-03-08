package designPattern;

public class YabaGuys implements BoyFriend{

    @Override
    public void spend() {
        System.out.println("Spending like a Yaba guy");
    }

    @Override
    public void cook() {
        System.out.println("Cooking like a Yaba guy");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning like a Yaba guy");
    }
}
