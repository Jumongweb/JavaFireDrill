package designPattern;

public class LekkiGuys implements BoyFriend {

    @Override
    public void spend(){
        System.out.println("Spending like a LekkiGuy");
    }

    @Override
    public void cook() {
        System.out.println("Cooking like a LekkiGuy");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning like LekkiGuy");
    }
}
