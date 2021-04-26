//MyThread variations. This version of MyThread
//creates a Thread when its constructor is called
//and stores it in an instance variable called thrd.
//It also sets the name of the thread and provides
//a factory method to create and start a thread

class MyThread2 implements Runnable {
    Thread thrd; //a reference to the thread is stored in thrd
    //construct a new thread using Runnable and give it a name
    MyThread2(String name){
        thrd = new Thread(this, name); //the thread is named when it's created
    }
    //a public factory method that creates and starts a thread.
    public static MyThread2 createAndStart(String name){
        MyThread2 myThrd = new MyThread2(name);

        myThrd.thrd.start(); //start the thread
        return myThrd;
    }
    //Entry point of thread
    public void run() {
        System.out.println(thrd.getName() +  " starting.");
        try{
            for (int count =0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In  " + thrd.getName() + ", count is " + count);

            }

        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted");

        }
        System.out.println(thrd.getName() + " terminating....");
    }
}