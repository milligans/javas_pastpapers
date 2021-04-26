public class MoiThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray() ;
    int a[];
    int answer;

    //Construct a new thread
    MoiThread(String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;

    }
    //A factory method that creates and starts a thread.
    public static MoiThread createAndStart(String name, int nums []) {
        MoiThread myThrd = new MoiThread(name, nums);

        myThrd.thrd.start(); //start the thread
        return myThrd;
    }
    //Entry point of thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}