package interprocess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestThread {
    public static final Logger logger = LogManager.getLogger(TestThread.class);

    public static void main(String[] args) {
        Chat m = new Chat();
        new QuestionThread(m);
        new AnswerThread(m);
    }
}
