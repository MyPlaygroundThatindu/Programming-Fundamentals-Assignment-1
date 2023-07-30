public class Demo3 {

    public static void main(String[] args) {
        int areaCode = 123;
        int numSet1 = 456;
        int numSet2 = 7890;
        String colorStrt = "\033[34m";
        String colorEnd = "\033[0m";

        System.out.printf("%1$s(%3$d)%2$s %4$d-%5$d\n",colorStrt, colorEnd, areaCode, numSet1, numSet2);
    }

}
