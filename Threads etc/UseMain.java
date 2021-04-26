/*
Try this 11-2
Controlling the main thread
 */

class UseMain {
    public static void main (String [] args){
        Thread thrd;
        //get the curent thread
        thrd= Thread.currentThread();
        //Disply the main thread's name
        System.out.println("Main thread is called " + thrd.getName());
        //Dispy main threads priortiy
        System.out.println("Main thread priority is  " + thrd.getPriority());
        System.out.println();

        //set the name and priority
        System.out.println("Setting the name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        System.out.println("The main thread is now called " + thrd.getName());
        System.out.println("Priority is now " + thrd.getPriority());
    }
}