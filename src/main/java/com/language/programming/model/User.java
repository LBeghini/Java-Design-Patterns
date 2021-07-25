package com.language.programming.model;

public class User {

    Command command;
    Hypervisor adapter;

    public User() {
        command = new WindowsCommand();
        adapter = new Hypervisor(command);

    }

    public void setCommand(String windows) {
        command.setCommand(windows);
        adapter.executeCommand();
    }

    public String getCommand() {
        return adapter.recoverCommand();
    }
}
