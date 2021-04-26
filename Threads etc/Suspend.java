class Suspend {
    public static void main (String [] args) {
        AThread mt1 = AThread.createAndStart("My Thread");

        try{
            Thread.sleep(1000);//let ob1 thread start exectuting

            mt1.mysuspend();
            System.out.println("Suspending thread");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Supsending thread");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Stopping thread");
            mt1.mystop();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");

        }
        //wait for thread to finish
        try {
            mt1.thrd.join();
        }catch(InterruptedException e ) {
            System.out.println("Man thread interrupted");
        }
        System.out.println("main thread exiting");
    }
}