package com.rongpengli.designpattern._18State;

public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜你投票成功");
    }

}
