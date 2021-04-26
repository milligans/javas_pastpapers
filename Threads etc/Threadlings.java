//Create multiple threads

class Threadlings implements Runnable {
    Thread thrd;
    //construct a new thread
    Threadlings(String name) {
        thrd=new Thread(this,name);
    }
    //A factory method that creates and starts a thread.
    public static Threadlings createAndStart (String name) {
        Threadlings myThrd = new Threadlings(name);

        myThrd.thrd.start(); //start the thread
        return myThrd;
    }
    //Entry point of thread
    public void run() {
        System.out.println(thrd.getName() + " starting. ");
        try{
            for (int count = 0; count < 10; count ++) {
                Thread.sleep(400);
                System.out.println("In  " + thrd.getName() + ", count is " + count);
            }
        }
        catch(InterruptedException exc){
            System.out.println(thrd.getName() + " interrupted\\!");

        }
        System.out.println(thrd.getName() + " terminating.");
    }
}