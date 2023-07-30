public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;
        
        String R = "\033[31m";
        String G = "\033[32m";
        String Y = "\033[33m";
        String B = "\033[34m";
        String P = "\033[35m";
        String LB = "\033[36m";
        String E = "\033[0m";

        //"12/28/2023 23:59:59"
        System.out.printf("%7$s%1$d%13$s/%8$s%2$d%13$s/%9$s%3$d%13$s %10$s%4$d%13$s:%11$s%5$d%13$s:%12$s%6$d%13$s\n", month, day, year, hour, minute, second, R, G, Y, B, P, LB, E);
    }
}
