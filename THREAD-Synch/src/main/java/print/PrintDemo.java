package print;

/**
 * Created by 912867 on 07.05.2015.
 */

    public class PrintDemo {

        public PrintDemo() {
        }

        public void printCount(){
            try {
                for(int i = 5; i > 0; i--) {
                    System.out.println("Counter   ---   "  + i );
                }
            } catch (Exception e) {
                System.out.println("Thread  interrupted.");
            }
        }

    }
