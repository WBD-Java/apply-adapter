package com.codegym;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());

        CollectionOperations coll = new CollectionUtilsAdapter();
        Client client = new Client(coll);
        client.printMaxValue(numbers);
    }
}
