package com.language.programming.model;

import java.util.Stack;

public class Artist {

    private Stack<Action> actions = new Stack<>();

    public void executeAction(Action action) {
        this.actions.add(action);
        action.execute();
    }

    public void cancelLastAction() {
        Action lastAction = actions.pop();
        lastAction.cancel();
    }

}
