package enumPractice;

public enum Planet {
    EARTH(1),
    JUPITER(2),
    MARS(3),
    MERCURY(4),
    SATURN(5),
    NEPTUNE(6),
    VENUE(7),
    URANUS(8),
    PLUTO(9);

    private int number;

    Planet(int number) {
        this.number = number;
    }
    public int getNumber(){ return number; }
};
