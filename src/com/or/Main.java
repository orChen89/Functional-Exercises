package com.or;

import com.or.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //Task 1 -
        onlyNegativeList();

        //Task 2 -
        negativeAndDividedBy3();

        //Task 3 -
        stringWithIntegers();

    }

    private static void onlyNegativeList() {

        List<Integer> nums = new ArrayList<>();

        List<Integer> negativeNums = new ArrayList<>();

        nums.add(30);
        nums.add(-1);
        nums.add(2);
        nums.add(-13);
        nums.add(4);
        nums.add(40);
        nums.add(-7);

        nums.stream().filter((x) -> x < 0).forEach(negativeNums::add);
        System.out.println(negativeNums);
    }

    private static void negativeAndDividedBy3() {

        List<Integer> nums = new ArrayList<>();

        List<Integer> negativeBy3 = new ArrayList<>();

        nums.add(30);
        nums.add(-1);
        nums.add(-33);
        nums.add(2);
        nums.add(-13);
        nums.add(4);
        nums.add(40);
        nums.add(90);
        nums.add(3);
        nums.add(-30);
        nums.add(-60);

        nums.stream().filter((x) -> x < 0).filter((x) -> x % 3 == 0).forEach(negativeBy3::add);
        System.out.println(negativeBy3);
    }

    private static void stringWithIntegers() {

        List<Integer> nums = new ArrayList<>();

        List<Integer> nums2 = new ArrayList<>();

        List<String> stringAndNums;

        nums.add(30);
        nums.add(-1);
        nums.add(-33);
        nums.add(2);
        nums.add(-13);
        nums.add(4);
        nums.add(-60);

        String name = "Number: ";

        nums.stream().filter((x) -> x < 0).filter((x) -> x % 3 == 0).forEach(nums2::add);

        stringAndNums = nums2.stream().map((x) -> name + x).collect(Collectors.toList());

        System.out.println(stringAndNums);
    }

}
