package com.rongpengli.designpattern._18State;

public class SpiteVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String s = voteManager.getMapVote().get(user);
        if (s != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票行为，取消投票资格");
    }

}
