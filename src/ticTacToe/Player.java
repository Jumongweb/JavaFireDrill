package ticTacToe;

public class Player {
    private String name;
    private static Symbol symbol = Symbol.EMPTY;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSymbol(Symbol symbol){
        Player.symbol = symbol;
    }
    public Symbol getSymbol(){
        return symbol;
    }


    public static void main(String[] args) {
        Player player = new Player();
        System.out.println();
        player.setSymbol(Symbol.X);
        System.out.println(symbol.name());
    }

}

