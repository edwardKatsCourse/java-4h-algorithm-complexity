package com.company.complexity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1. Algorithm complexity (search)
        //  - Big O, Big Theta notations
        //  - O(N), O(N^2), O(log N), O(1)
        //2. Binary Search (comparable/comparator)
        //3. Array Copy


        /**
         * big O (max)
         * big theta
         * big O (min)
         */

        List<String> names = new ArrayList<>();
        names.add("Sarah");
        names.add("James");
        names.add("Peter");
        names.add("Simon");
        //....
        names.add("David");
        //1,000,000


        //"Peter" -> O(3)
        //"Sarah" -> O(1)

        //O(N)
        //Linear
        System.out.println("Enter name to search:");
        String searchingName = new Scanner(System.in).nextLine();

        for (String name : names) {
            if (name.equals(searchingName)) {
                System.out.println("Found");
                return;
            }
        }

        System.out.println("Not found");


    }
}
