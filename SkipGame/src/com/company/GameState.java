package com.company;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    private State state;
    private List<String> messages;

    public int total, skipValue;

    public GameState() {
        state = State.welcome;
        messages = new ArrayList<>();
        total = 0;
        skipValue = 1;
    }

    public State getState(){
        return this.state;
    }

    public void setState(State state){
        this.state = state;
    }

    public void queueMessage(String s) {
        messages.add(s);
    }

    public List<String> popMessages(){
        List<String> temp = new ArrayList<>(messages);
        messages = new ArrayList<>();
        return temp;
    }
}
