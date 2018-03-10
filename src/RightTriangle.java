public class RightTriangle {
    public static void printTriangle(Integer number) {
        for (int i=0; i<number; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
