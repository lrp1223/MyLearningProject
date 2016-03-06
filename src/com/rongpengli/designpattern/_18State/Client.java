package com.rongpengli.designpattern._18State;

public class Client {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0; i < 8; i++) {
            vm.vote("ul", "A");
        }
    }

}
