class MoinThread implements Runnable {
    Thread thrd;
    TickTock ttOb;
    //construct a new thread
    MoinThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }
    //A factory method that creates and starts a thread
    public static MoinThread createAndStart (String name, TickTock tt) {
       MoinThread myThrd = new MoinThread(name, tt);
       myThrd.thrd.start(); //start the thread
        return myThrd;
    }
    //entry point of thread
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for(int i=0; i<5; i++) ttOb.tick(true);
            ttOb.tock(false);
        }else {
            for(int i= 0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}