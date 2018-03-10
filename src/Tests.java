public class Tests {

    public static void main (String[] args) {
        testPrintAsterix();
        testHorizontalLine();
        testVerticalLine();
    }

    public static void testPrintAsterix() {
        System.out.println("Output should be *");
        PrintAsterix.printAsterix();
    }

    public static void testHorizontalLine() {
        System.out.println("Output should be a horizontal line of 5 *");
        HorizontalLine.printLine(5);
    }
    public static void testVerticalLine() {
        System.out.println("Output should be a vertical line of 5 *");
        VerticalLine.printLine(5);
    }
}
