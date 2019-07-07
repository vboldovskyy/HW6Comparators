package com.cursor.comparators;

import java.util.Comparator;

class OddEvenComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if (Math.abs(a % 2) == Math.abs(b % 2))   // abs to account for negative odd integers
            return a - b;
        return (a % 2 == 0) ? -1 : 1;
    }
}


