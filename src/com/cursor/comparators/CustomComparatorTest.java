package com.cursor.comparators;

import java.util.*;

class CustomComparatorTest {

    private static Integer[] numbers = {2, 1, 4, 3, 5, 7, 6};
    private Set<Integer> set;

    CustomComparatorTest() {
        set = new TreeSet<>(new OddEvenComparator());
    }

    private void manualAddInSequence() {
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(6);
        System.out.println("After adding elements in sequence the resulting set is:" + set);
        flush();
    }

    private void randomOrder() {
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        Collections.shuffle(list);
        System.out.println("Now putting elements in random order: " + list);
        set.addAll(list);
        System.out.println("After adding elements at random the resulting set is: " + set);
        flush();
    }

    private void checkingDuplicatesAndNegativeNumbers() {
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        list.add(4);
        list.add(-2);
        list.add(-5);
        System.out.println("To ensure the comparator works correctly on duplicates and negative integers");
        System.out.println("We use a list of: " + list);
        set.addAll(list);
        System.out.println("The resulting set should be ordered and without duplicates: " + set);
        flush();
    }

    void checkAll() {
        manualAddInSequence();
        randomOrder();
        checkingDuplicatesAndNegativeNumbers();
    }

    private void flush() {
        set.clear();
    }

}
