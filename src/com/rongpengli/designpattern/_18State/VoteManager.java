package com.rongpengli.designpattern._18State;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
    private VoteState state = null;
    private final Map<String, String> mapVote = new HashMap<String, String>();

    private final Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user, String voteItem) {
        // 1. 先为该用户增加投票的次数，从记录中取出已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount++;
        mapVoteCount.put(user, oldVoteCount);

        // 2. 判断该用户投票的类型，就相当于是判断投票对应的状态
        // 到底是正常投票、重复投票、恶意投票还是上黑名单的状态
        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepreatVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SpiteVoteState();
        } else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }

        state.vote(user, voteItem, this);
    }
}
