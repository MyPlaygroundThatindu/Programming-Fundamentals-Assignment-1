public class Demo6_task_d {
    public static void main(String[] args) {
        String item1 = "Apples";
        int qty1 = 5;
        double  price1 = 0.99;

        String item2 = "Oranges";
        int qty2 = 10;
        double  price2 = 1.49;

        String R = "\033[31m";
        String B = "\033[34m";
        String G = "\033[32m";
        String Y = "\033[33m";
        String W = "\033[37:1m";
        String E = "\033[0m";

        final String LINE_TOP = "%1$s+" + "-".repeat(10) + "+" + "-".repeat(10) + "+" + "-".repeat(10) + "+\n%2$s";
        final String LINE = "%1$s+%2$s%3$s" + "-".repeat(10) + "%2$s%1$s+" + "-".repeat(10) + "+%2$s%3$s" + "-".repeat(10) + "%2$s%1$s+\n%2$s";
        final String RECORD = "%6$s|%5$s%-10s%6$s|%5$s%7$s%10d%5$s%6$s|%5$s%8$10s$%5$s%4$s%4.2f%5$s%6$s|%5$s\n";
        final String COL_HEAD = "%6$s|%5$s%4$s%-10s%5$s%6$s|%5$s%4$s%-10s%5$s%6$s|%5$s%4$s%10s%5$s%6$s|%5$s\n";
   
        System.out.printf(LINE_TOP, Y, E);
        System.out.printf(COL_HEAD, "ITEM", "QUANTITY", "PRICE", W, E, Y);
        System.out.printf(LINE, Y, E, G);
        System.out.printf(RECORD, item1, qty1, price1, R, E, Y, B, G);
        System.out.printf(RECORD, item2, qty2, price2, R, E, Y, B, G);
        System.out.printf(LINE, Y, E, G);
    }
}
