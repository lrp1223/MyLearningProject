package com.rongpengli.designpattern._18State;

public class RepreatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }

}
