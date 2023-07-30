public class Demo6_task_c {
    public static void main(String[] args) {
        String city1 = "Los Angeles";
        String state1 = "California";
        int  population1 = 3966936;

        String city2 = "\033[32mNew\033[0m York" + " ".repeat(7);
        String state2 = "\033[32mNew\033[0m York" + " ".repeat(5);
        int  population2 = 8336817;

        String R = "\033[31m";
        String W = "\033[37:1m";
        String Y = "\033[33m";
        String E = "\033[0m";

        final String LINE = "%1$s+" + "-".repeat(15) + "+" + "-".repeat(13) + "+" + "-".repeat(10) + "+\n%2$s";
        final String RECORD = "%6$s|%5$s%-15s%6$s|%5$s%-13s%6$s|%5$s%4$s%,10d%5$s%6$s|%5$s\n";
        final String COL_HEAD = "%6$s|%5$s%4$s%-15s%5$s%6$s|%5$s%4$s%-13s%5$s%6$s|%5$s%4$s%10s%5$s%6$s|%5$s\n";
   
        System.out.printf(LINE, Y, E);
        System.out.printf(COL_HEAD, "CITY", "STATE", "POPULATION", W, E, Y);
        System.out.printf(LINE,Y, E);
        System.out.printf(RECORD, city1, state1, population1, R, E, Y);
        System.out.printf(RECORD, city2, state2, population2, R, E, Y);
        System.out.printf(LINE, Y, E);
    }
}
