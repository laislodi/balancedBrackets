package com.laislodi.hackerrank.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ConcatOrderedList {

    public static void main(String[] args) {
        Integer[] list1 = new Integer[]{1, 2, 3, 4, 7};
        Integer[] list2 = new Integer[]{3, 4, 5, 6};

        List<Integer> concatOrderedList = concatOrderedList(list1, list2);
        for (Integer i : concatOrderedList) {
            System.out.println(i);
        }

        List<Integer> otherList1 = Arrays.asList(list1);
        List<Integer> otherList2 = Arrays.asList(list2);
        TreeSet<Integer> integerTreeSet = concatOrderedList(otherList1, otherList2);
        System.out.println("------------- TreeSet -------------");
        for (Integer i : integerTreeSet) {
            System.out.println(i);
        }
    }

    private static List<Integer> concatOrderedList(Integer[] list1, Integer[] list2) {
        List<Integer> integers = new ArrayList<>();
        int position1 = 0;
        int position2 = 0;

        while (position1 < list1.length || position2 < list2.length) {
            Integer nextNumber;

            if (position1 == list1.length) {
                nextNumber = list2[position2++];
            } else if (position2 == list2.length){
                nextNumber = list1[position1++];
            } else if (list1[position1] < list2[position2]) {
                nextNumber = list1[position1++];
            } else if (list1[position1] > list2[position2]){
                nextNumber = list2[position2++];
            } else {
                nextNumber = list1[position1++];
                position2++;
            }

            integers.add(nextNumber);
        }
        return integers;
    }

    private static TreeSet<Integer> concatOrderedList(List<Integer> list1, List<Integer> list2) {
        TreeSet<Integer> sortedSet = new TreeSet<>(list1);
        sortedSet.addAll(list2);
        return sortedSet;
    }
}
