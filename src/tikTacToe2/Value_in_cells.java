package tikTacToe2;

public enum Value_in_cells {
    EMPTY("EMPTY"),
    X("X"),

    O("O");

    private final String value;
    //private String name;

    Value_in_cells(String value) {
      //  this.name = name;
        this.value = value;
    }

    public String getValue(){
        return getValue();
    }

    @Override
    public String toString(){
        return getValue();
    }
}
