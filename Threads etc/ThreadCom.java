class ThreadCom{
    public static void main ( String [] args) {
        TickTock tt = new TickTock();
        MoinThread mt1 = MoinThread.createAndStart("Tick", tt);
        MoinThread mt2 = MoinThread.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch(InterruptedException exc){
            System.out.println("Main Thread interrupted");
        }
    }
}