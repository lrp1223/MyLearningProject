package com.rongpengli.designpattern._13Command;

public class Client {

    public static void main(String[] args) {
        MainBoardApi mainboardApi = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainboardApi);

        Box box = new Box();
        box.setOpenCommand(openCommand);

        box.openButtonPressed();
    }

}
