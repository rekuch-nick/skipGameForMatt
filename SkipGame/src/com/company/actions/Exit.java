package com.company.actions;

import com.company.GameState;
import com.company.State;

public class Exit implements Action {

    @Override
    public void execute(GameState gs) {
        gs.setState(State.done);
    }
}
