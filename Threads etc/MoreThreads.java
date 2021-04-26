class MoreThreads {
    public static void main ( String [] args) {
        System.out.println("Main thread starting, suckers");

        Threadlings mt1 = Threadlings.createAndStart("Child#1");
        Threadlings mt2 = Threadlings.createAndStart("Child#2");
        Threadlings mt3 = Threadlings.createAndStart("Child#3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }while (mt1.thrd.isAlive() ||
                mt2.thrd.isAlive() ||
               mt3.thrd.isAlive() );

        System.out.println("Main thread ending.");
    }
}