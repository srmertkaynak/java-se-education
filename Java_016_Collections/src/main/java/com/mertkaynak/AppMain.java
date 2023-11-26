package com.mertkaynak;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List myList1 = new ArrayList();
        myList1.add("Mehmet");
        myList1.add(10);

        List <Integer> myList2 = new ArrayList();
        myList2.add(15);

        System.out.println("Liste 1: : " + myList1);
        System.out.println("Liste 2: : " + myList2);

        System.out.println("Liste 1: : " + myList1.isEmpty());
        System.out.println("Liste 1: : " + myList1.contains("Mehmet"));


    }
}