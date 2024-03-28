package tikTacToe2;

import tikTacToe2.Exceptions.InvalidPlayerException;

public class Player {
    private int playerId;
    private Value_in_cells playerSignature = Value_in_cells.EMPTY;

    public Player(int playerId) throws InvalidPlayerException{
        this.playerId = playerId;
        setPlayerSignature(playerId);
    }
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Value_in_cells getPlayerSignature() {
        return playerSignature;
    }

    public void setPlayerSignature(int playerId) throws InvalidPlayerException {
        if (playerId < 0 || playerId > 2) throw new InvalidPlayerException("Player should not be more than two");
        if (playerId == 1) this.playerSignature = Value_in_cells.X;
        if (playerId == 2) this.playerSignature = Value_in_cells.O;
    }

    public void play(TicTacToe ticTacToe, int rowToPlay, int columnToPlay){
        ticTacToe.getTicTacToeBoard()[rowToPlay][columnToPlay] = this.playerSignature;
    }

}
