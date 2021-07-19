package com.company;

public class Main {

    int i = 0;

    public Main(){
        for(int j = 0; j < 10; j++) {
            Inheritance thread_inheritance = new Inheritance();
            thread_inheritance.start();

            Thread implements_thread = new Thread(new Implements());
            implements_thread.start();
        }
    }

    public static void main(String[] args) {
        // write your code here
        new Main();
    }
}
