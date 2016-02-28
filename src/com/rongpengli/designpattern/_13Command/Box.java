package com.rongpengli.designpattern._13Command;

public class Box {
    private Command openCommand;

    public Command getOpenCommand() {
        return openCommand;
    }

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }
}
