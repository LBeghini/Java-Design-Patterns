package com.language.programming.model;

public class Hypervisor extends UnixCommand {

    private Command windowsCommand;

    public Hypervisor(Command windowsCommand) {
        this.windowsCommand = windowsCommand;
    }

    public void executeCommand() {
        if (windowsCommand.getCommand().equals("dir")) {
            this.setCommand("ls");
            return;
        }

        if (windowsCommand.getCommand().equals("cls")) {
            this.setCommand("clear");
            return;
        }

        if (windowsCommand.getCommand().equals("copy")) {
            this.setCommand("cp");
            return;
        }

        if (windowsCommand.getCommand().equals("find")) {
            this.setCommand("grep");
            return;
        }

        if (windowsCommand.getCommand().equals("move")) {
            this.setCommand("mv");
            return;
        }

        if (windowsCommand.getCommand().equals("del")) {
            this.setCommand("rm");
            return;
        }

    }

    public String recoverCommand() {

        if (this.getCommand().equals("ls")) {
            windowsCommand.setCommand("dir");
        }

        if (this.getCommand().equals("clear")) {
            windowsCommand.setCommand("cls");
        }

        if (this.getCommand().equals("cp")) {
            windowsCommand.setCommand("copy");
        }

        if (this.getCommand().equals("grep")) {
            windowsCommand.setCommand("find");
        }

        if (this.getCommand().equals("mv")) {
            windowsCommand.setCommand("move");
        }

        if (this.getCommand().equals("rm")) {
            windowsCommand.setCommand("del");
        }

        return windowsCommand.getCommand();

    }

}
