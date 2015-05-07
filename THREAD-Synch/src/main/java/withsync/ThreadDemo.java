package withsync;

import print.PrintDemo;

/**
 * Created by 912867 on 07.05.2015.
 */
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo( String name,  PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    public void run() {
        synchronized(PD) {
            PD.printCount();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start ()
    {
        System.out.println("Starting " +  threadName );
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}