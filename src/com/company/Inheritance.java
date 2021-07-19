package com.company;

public class Inheritance  extends Thread{

    private static int angka = 2;

    @Override
    public void run() {
        System.out.println("This is inheritance thread, Thread " + Thread.currentThread().getId());
        angka = angka * 2;
        System.out.println("Thread " + Thread.currentThread().getId() + " Times " + angka);
    }
}
