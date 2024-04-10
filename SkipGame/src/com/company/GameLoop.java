package com.company;



public class GameLoop {

    public void run() {

        GameState gameState = new GameState();

        while(gameState.getState() != State.done){
            Output.drawScreen(gameState);
            Action a = Input.get();
            a.execute(gameState);
        }

        gameState.queueMessage("\nThanks for playing!");
        Output.drawScreen(gameState);
    }
}
