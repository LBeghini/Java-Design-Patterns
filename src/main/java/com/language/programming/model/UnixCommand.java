package com.language.programming.model;

public class UnixCommand implements Command {

    private String command;

    @Override
    public String getCommand() {
        return this.command;
    }

    @Override
    public void setCommand(String command) {
        this.command = command;

    }

}
