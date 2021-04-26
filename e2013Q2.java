//Q: Why does Java have two ways to create child threads
// (by extending Thread or implementing Runnable) and which approach is better?
// A: The Thread class defines several methods that can be overridden by a derived class.
// Of these methods, the only one that must be overridden is run( ).
// This is, of course, the same method required when you implement Runnable.
// Some Java programmers feel that classes should be extended only when they are
// being expanded or customized in some way. So, if you will not be overriding any
// of Thread’s other methods, it is probably best to simply implement Runnable.
// Also, by implementing Runnable, you enable your thread to inherit a class other than Thread.

public class TestThread extends Thread{
    public void run()
    {//code omiited for simplicity
    }
}