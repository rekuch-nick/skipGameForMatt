package com.company;

public class Output {

    public static void drawScreen(GameState gs){

        if(gs.getState() == State.welcome){
            gs.queueMessage("\nWelcome to the Skip Game, where you can count by skips");
            gs.setState(State.play);
        }

        for(String s : gs.popMessages()){
            System.out.println(s);
        }

        if(gs.getState() == State.play){
            System.out.println();
            System.out.println("Please Choose an Action: ");
            System.out.println("1 : Set Skip Value");
            System.out.println("2 : Increment Skip by 5");
            System.out.println("3 : Stats");
            System.out.println("4 : Exit");
            System.out.print(">  ");
        }

    }
}
