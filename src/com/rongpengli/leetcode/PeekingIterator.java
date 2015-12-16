package com.rongpengli.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class PeekingIterator implements Iterator<Integer> {
    List<Integer> mList = new ArrayList<>();

    public PeekingIterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            mList.add(iterator.next());
        }

    }

    public Integer peek() {
        return mList.get(1);
    }

    @Override
    public Integer next() {
        if (mList.size() == 0) {
            throw new NoSuchElementException();
        }
        Integer lInteger = mList.get(0);
        mList.remove(0);
        return lInteger;
    }

    @Override
    public boolean hasNext() {
        return mList.size() > 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

}
