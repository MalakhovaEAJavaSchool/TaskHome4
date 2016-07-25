package com.company;

public class Main {

    public static void main(String[] args) {
        LList<Integer> myList = new LList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(myList);
        System.out.println(".get(3): \t\t\t\t" + myList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t\t\t" + myList.remove(2) + " (element removed)");
        System.out.println(".get(3): \t\t\t\t" + myList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println("Print again: MyList: \t" + myList);
    }
}

