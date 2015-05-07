package interprocess;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by 912867 on 07.05.2015.
 */

public class Chat {
    public static final Logger logger = LogManager.getLogger(Chat.class);
    boolean flag = false;

    public synchronized void Question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.error(e.getMessage(),e);
            }
        }
       logger.info(msg);
        flag = true;
        notify();
    }

    public synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
               logger.error(e.getMessage(),e);
            }
        }

        logger.info(msg);
        flag = false;
        notify();
    }
}
