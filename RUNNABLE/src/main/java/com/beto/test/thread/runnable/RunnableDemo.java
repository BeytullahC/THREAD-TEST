package com.beto.test.thread.runnable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by 912867 on 06.05.2015.
 */
public class RunnableDemo implements Runnable{

    public static final Logger logger = LogManager.getLogger(RunnableDemo.class);
    private Thread thread;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        logger.debug("Running " + threadName);
        try {
            for(int i = 5; i > 0; i--) {
                logger.debug("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            logger.debug("Thread " + threadName + " interrupted.");
        }
        logger.info("Thread " + threadName + " exiting.");
    }

    public void start ()
    {
        logger.debug("Starting " + threadName);
        if (thread == null)
        {
            thread = new Thread (this, threadName);
            thread.start ();
        }
    }

}

