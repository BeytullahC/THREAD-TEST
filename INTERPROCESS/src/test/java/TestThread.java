import interprocess.AnswerThread;
import interprocess.Chat;
import interprocess.QuestionThread;
import org.junit.Test;

/**
 * Created by 912867 on 07.05.2015.
 */
public class TestThread {

    @Test
    public void test(){
        Chat m = new Chat();
        new QuestionThread(m);
        new AnswerThread(m);
    }
}
