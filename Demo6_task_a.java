public class Demo6_task_a {
    public static void main(String[] args) {

        String backGroundLeft = "\033[41m";
        String backGroundRight = "\033[42m";
        String letterLeft = "\033[31m";
        String letterRight = "\033[32m";
        String E = "\033[0m";

        final String SPACE = " ".repeat(4);

        System.out.printf("%1$s[%6$s5%5$s%2$s0%%%6$s]%5$s\n", backGroundLeft, backGroundRight, letterLeft, letterRight, E, SPACE);
    }
}
