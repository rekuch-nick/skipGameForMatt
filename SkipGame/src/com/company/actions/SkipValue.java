package com.company.actions;

import com.company.GameState;
import com.company.actions.Action;

public class SkipValue implements Action {
    @Override
    public void execute(GameState gs) {
        gs.queueMessage("Value Action");
    }
}
