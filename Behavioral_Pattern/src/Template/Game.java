package Template;

public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();

    //template method
    public final void play(){

        //initialize the game
        initialize();
        //start game
        start();
        //end game
        end();
    }
}
