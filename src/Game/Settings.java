package Game;

public class Settings {
    //Keeping track of the squares, and the moves of the player and the computer
    protected int status = 0;

    public Settings(int status){
        this.setStatus(status);
    }
    //GETTERS AND SETTERS FOR STATUS AND PLAYER MOVES
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return status;
    }

}





