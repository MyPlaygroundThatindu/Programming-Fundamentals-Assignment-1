public class Demo6_task_b {
    public static void main(String[] args) {

        String name1 = "Alice";
        int  age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        String R = "\033[31m";
        String Y = "\033[33m";
        String B = "\033[34:1m";
        String E = "\033[0m";

        final String LINE = "%1$s+" + "-".repeat(15) + "+" + "-".repeat(6) + "+\n%2$s";
        final String RECORD = "%5$s|%4$s%1$-15s%5$s|%4$s%3$s%2$6d%4$s%5$s|%4$s\n";
        final String COL_HEAD = "%5$s|%4$s%6$s%1$-15s%4$s%5$s|%4$s%6$s%2$6s%4$s%4$s%5$s|%4$s\n";
   
        System.out.printf(LINE, Y, E);
        System.out.printf(COL_HEAD, "NAME", "AGE", B, E, Y, B);
        System.out.printf(LINE, Y, E);
        System.out.printf(RECORD, name1, age1, R, E, Y);
        System.out.printf(RECORD, name2, age2, R, E, Y);
        System.out.printf(LINE, Y, E);

    }
    
}
