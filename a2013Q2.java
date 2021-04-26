public class a2013Q2{
    public static void main (String [] args) {
        int arg0 = 0;
        int arg1 = 0;
        int arg2 = 0;

        try {
            if (args.length == 0) {
                System.out.println("FAIL");
            } else if (args.length == 1) {
                System.out.println("FAIL");
            } else if (args.length == 2) {
                System.out.println("FAIL");
            } else if (args.length == 3) {
                arg0 = Integer.parseInt(args[0]);
                arg1 = Integer.parseInt(args[1]);
                arg2 = Integer.parseInt(args[2]);
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        catch (Exception e){
            System.out.println("FAIL");
        }
    }




    }
