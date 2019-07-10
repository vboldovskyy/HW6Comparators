package com.cursor.comparators;

import java.util.*;

class CustomComparatorTest {

    private static final Integer[] numbers = {2, 1, 4, 3, 5, 7, 6};
    private Set<Integer> set;

    CustomComparatorTest() {
        set = new TreeSet<>(new OddEvenComparator());
    }

    void checkAll() {
        addManuallyInSequence();
        orderRandomly();
        checkDuplicatesAndNegativeNumbers();
    }

    private void addManuallyInSequence() {
        System.out.print("After adding elements ");
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
            System.out.print("" + numbers[i] + ", ");
        }
        System.out.println("in sequence the resulting set is: " + set);
        flush();
    }

    private void orderRandomly() {
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        Collections.shuffle(list);
        System.out.println("Now putting elements in random order: " + list);
        set.addAll(list);
        System.out.println("After adding elements at random the resulting set is: " + set);
        flush();
    }

    private void checkDuplicatesAndNegativeNumbers() {
        Collections.addAll(set, numbers);
        set.add(4); // duplicate
        set.add(-2); //negative even
        set.add(-3); // negative odd
        System.out.println("To ensure the comparator works correctly on duplicates and negative integers");
        System.out.println("The resulting set should be ordered and without duplicates: " + set);
        flush();
    }

    private void flush() {
        set.clear();
    }

}
