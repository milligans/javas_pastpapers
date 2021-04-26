/*
Try this 11-1
Extend Thread
 */
class MyThread extends Thread {
    //construct a new thread.
    MyThread(String name){
        super(name); //name thread

    }
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);
        myThrd.start();
        return myThrd;
    }
    //Entry point of thread
    public void run() {
        System.out.println(getName() +  " starting.");
        try{
            for (int count =0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In  " + getName() + ", count is " + count);

            }

        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted");

        }
        System.out.println(getName() + " terminating....");
    }
}

class ExtendThread {
    public static void main ( String args []){
        MyThread mt = MyThread.createAndStart("Child#7");
//        mt.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);

            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");

            }
        }
        System.out.println("Main thread ending.");
    }
}
