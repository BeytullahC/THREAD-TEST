package interprocess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnswerThread implements Runnable {
    public static final Logger logger = LogManager.getLogger(AnswerThread.class);
            Chat m;
    String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    public AnswerThread(Chat m2) {
        this.m = m2;
        new Thread(this, "Answer").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}

