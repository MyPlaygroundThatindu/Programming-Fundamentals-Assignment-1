public class Demo5 {
    public static void main(String[] args) {
        int num1 = 978;
        int num2 = 3;
        int num3 = 16;
        int num4 = 1484100;

        String R = "\033[31m";
        String G = "\033[32m";
        String Y = "\033[33m";
        String B = "\033[34m";
        String E = "\033[0m";

        System.out.printf("%5$s%1$d%9$s-%6$s%2$d%9$s-%7$s%3$d%9$s-%8$s%4$d%9$s\n", num1, num2, num3, num4, R, G, Y, B, E);
    }
}
