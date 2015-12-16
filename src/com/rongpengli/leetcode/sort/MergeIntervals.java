package com.rongpengli.leetcode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start < o2.start) {
                    return -1;
                } else if (o1.start > o2.start) {
                    return 1;
                } else if (o1.end < o2.end) {
                    return -1;
                } else if (o1.end > o2.end) {
                    return 1;
                }
                return 0;
            }
        });

        int length = intervals.size();
        for (int i = 0; i < length; i++) {
            if (i + 1 >= length) {
                break;
            }
            Interval o1 = intervals.get(i);
            Interval o2 = intervals.get(i + 1);
            if (o1.start <= o2.start && o1.end >= o2.start) {
                if (o1.end < o2.end) {
                    intervals.get(i).end = o2.end;
                }
                intervals.remove(i + 1);
                i--;
                length--;
            }
        }

        return intervals;
    }

    public static void main(String[] args) {
        MergeIntervals lMergeIntervals = new MergeIntervals();
        List<Interval> intervalList = new ArrayList<Interval>();
        // intervalList.add(new Interval(15, 18));
        // intervalList.add(new Interval(1, 3));
        // intervalList.add(new Interval(2, 6));
        // intervalList.add(new Interval(13, 17));
        // intervalList.add(new Interval(8, 10));
        intervalList.add(new Interval(8, 10));
        intervalList.add(new Interval(10, 12));

        intervalList = lMergeIntervals.merge(intervalList);
        for (Interval interval : intervalList) {
            System.out.println(interval.start + "," + interval.end);
        }
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
