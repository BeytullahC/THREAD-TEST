package deadlock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by 912867 on 07.05.2015.
 */
public class LockedSolution {
    public static final Logger logger = LogManager.getLogger(LockedSolution.class);
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[]) {

        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }

    private static class ThreadDemo1 extends Thread {
        public void run() {
            synchronized (Lock1) {
                logger.info("Thread 1: Holding lock 1...");
                try { Thread.sleep(10); }
                catch (InterruptedException e) {
                    logger.error(e);
                }
                logger.info("Thread 1: Waiting for lock 2...");
                synchronized (Lock2) {
                    logger.info("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }
    private static class ThreadDemo2 extends Thread {
        public void run() {
            synchronized (Lock1) {
                logger.info("Thread 2: Holding lock 1...");
                try { Thread.sleep(10); }
                catch (InterruptedException e) {
                    logger.error(e);
                }
                logger.info("Thread 2: Waiting for lock 2...");
                synchronized (Lock2) {
                    logger.info("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}