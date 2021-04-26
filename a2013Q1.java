public class Question1 {
    public static void main ( String [] args ){
        int inum =11;
        double dnum =3.7;
        double result1, result2;
        result1=(double)inum /4 +dnum;
        result2 = (double)((1/3) * inum + (1/2) * dnum);
        int result3;
        result3 = (inum/2) <<2;
        String result4 = dnum + " " + inum;
        StringBuffer buffer = new StringBuffer(result4);
        buffer.replace(2, 5, "***");
        String result5= buffer.toString();

        System.out.println("restult 1 is " + result1 + "\n Result 2 is " + result2 + "\nResult 3 is " + result3 +
                "\nResult 4 is " + result4 + "\nResult 5 is " + result5);

    }
}