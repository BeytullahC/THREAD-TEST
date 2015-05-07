package main;


import thread.ThreadDemo;

/**
 * Created by 912867 on 07.05.2015.
 */
public class ThreadTest {
    public static void main(String args[]) {

        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();
    }
}
