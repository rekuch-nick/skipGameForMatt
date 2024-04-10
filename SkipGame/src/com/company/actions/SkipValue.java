package com.company.actions;

public class SkipValue implements Action {
    @Override
    public void execute(GameState gs) {
        gs.queueMessage("Value Action");
    }
}
