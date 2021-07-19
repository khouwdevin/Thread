package com.company;

public class Implements implements Runnable{

    private static int number = 5;

    @Override
    public void run() {
        System.out.println("This is implements thread, Thread " + Thread.currentThread().getId());
        number = number + number;
        System.out.println("Thread " + Thread.currentThread().getId() + " Plus " + number);
    }
}
