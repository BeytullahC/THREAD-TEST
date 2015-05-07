package com.beto.test.thread.main;

import com.beto.test.thread.runnable.RunnableDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestThread {
    public static final Logger logger = LogManager.getLogger(TestThread.class);
    public static void main(String args[]) {
        logger.info("start");

        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();

        logger.info("end");
    }
}
