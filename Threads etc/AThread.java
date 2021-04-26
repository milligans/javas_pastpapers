//suspending resuming and stopping a thread

class AThread  implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    AThread(String name)  {
        thrd=new Thread(this, name);
        suspended=false;
        stopped=false;
    }
    //A factory method that creates and starts a thread.
    public static AThread createAndStart (String name) {
        AThread myThrd = new AThread(name);
        myThrd.thrd.start();
        return myThrd;
    }
    //Entry point of thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int i =1 ; i<1000; i++) {
                System.out.println(i + " ");
                if ((i%10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                //Use synchronized block to check suspended and stopped.
                synchronized (this){
                    while(suspended){
                        wait();
                    }
                    if(stopped) break;
                }
            }
        }catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");

        }
        System.out.println(thrd.getName()  + " exiting");

    }
    //stop the thread
    synchronized void mystop() {
        stopped = true;
        //the following ensures that a suspended thread can be stopped
        suspended = false;
        notify();

    }
    //suspend the thread.
    synchronized void mysuspend() {
        suspended=true;

    }
    //Resume the thread
    synchronized void myresume(){
        suspended= false;
        notify();
    }
}