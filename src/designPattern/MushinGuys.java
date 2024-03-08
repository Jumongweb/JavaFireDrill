package designPattern;

public class MushinGuys implements BoyFriend{

    @Override
    public void spend() {
        System.out.println("Spending like a Mushin Guy");
    }

    @Override
    public void cook() {
        System.out.println("Cooking like a Mushin Guy");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning like a Mushin Guy");
    }
}
