package logica;

import java.util.Random;

import grafica.GamePiece;

public class GameLogic {
    private int points;
    private int[][] gameBoard;

    private boolean isWaiting;
    private GamePiece piece;

    public GameLogic(){
        showGame();
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public int getPoints() {
        return points;
    }

    public boolean isWaiting() {
        return isWaiting;
    }

    public void setisWaiting(boolean isWaiting) {
        this.isWaiting = isWaiting;
    }

    public void setPiece(GamePiece piece) {
        this.piece = piece;
    }

    public GamePiece getPiece() {
        return piece;
    }

    public void addPoints(){
        points += 5;
    }

    public void reducePoints(){
        points -= 3;
    }

    private void showGame() {
        gameBoard = new int[4][4];
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                gameBoard[i][j] = getBoardFilled();
            }
        }
    }
    private int getBoardFilled() {
        while(true){
            int number = new Random().nextInt(9);
            int aux = 0;
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(number == gameBoard[i][j]){
                        aux++;
                    }
                }
            }
            if(aux < 2){
                return number;
            }
        }
    }

}
