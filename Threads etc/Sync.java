class Sync{
    public static void main ( String [] args) {
        int a[] = {1, 2,3, 4, 5};

        MoiThread mt1 = MoiThread.createAndStart("Child #1", a);
        MoiThread mt2 = MoiThread.createAndStart("Child #2", a);
        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc){
            System.out.println("Main thread interrupted.");
        }
    }
}