class UseThreads2 {
    public static void main ( String [] args ) {
        System.out.println("Main thread starting.");
        //First construct a mythread object.
        MyThread2 mt = new MyThread2("Child #1"); //create a runnable object
        //Next construct a thread from that object
        Thread newThrd = new Thread(mt); //construct a thread on the mt object
        //Finally start execution of the thread
        newThrd.start();

        for (int i = 0; i<50 ; i++ ){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}