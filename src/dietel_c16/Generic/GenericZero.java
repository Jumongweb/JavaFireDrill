package dietel_c16.Generic;

public class GenericZero<Thing> {
    private Thing value;
    public GenericZero(Thing value) {
        this.value = value;
    }
    public Thing getValue() {
        return value;
    }
}
