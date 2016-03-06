package com.rongpengli.designpattern._18State;

public interface VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager);
}
