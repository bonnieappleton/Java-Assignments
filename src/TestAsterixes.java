public class TestAsterixes {

    public static void main (String[] args) {
        testPrintAsterix();
        testHorizontalLine();
        testVerticalLine();
        testRightTriangle();
        testIsoscelesTriangle();
        testDiamond();
        testDiamondWithName();
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

    public static void testRightTriangle() {
        System.out.println("Output should be a right angle triangle with base n=5");
        RightTriangle.printTriangle(5);
    }

    public static void testIsoscelesTriangle() {
        System.out.println("Output should be an isosceles triangle with base 2n-1=5");
        IsoscelesTriangle.printTriangle(3);
    }

    public static void testDiamond() {
        System.out.println("Output should be a diamond with width 2n-1=5");
        Diamond.printDiamond(3);
    }

    public static void testDiamondWithName() {
        System.out.println("Output should be a diamond with width 2n-1=5 and name as the centre line");
        Diamond.printDiamond(3, "Bonnie");
    }
}
