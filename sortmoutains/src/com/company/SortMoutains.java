package com.company;

import java.util.*;

public class SortMoutains {
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class HeightCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain o1, Mountain o2) {
            return o2.getHeight()- o1.getHeight();
        }
    }

    public void go() {
        mtn.add(new Mountain("Long-Rainge", 14255));
        mtn.add(new Mountain("Albert", 14433));
        mtn.add(new Mountain("Marune", 14156));
        mtn.add(new Mountain("Kasle", 14256));
        System.out.println("In order added:\n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("Named:\n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("Heighted:\n" + mtn);
    }
}
