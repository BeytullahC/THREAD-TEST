package interprocess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuestionThread implements Runnable {
    public static final Logger logger = LogManager.getLogger(QuestionThread.class);
            Chat m;
    String[] s1 = {"Hi", "How are you ?", "I am also doing fine!"};

    public QuestionThread(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}
