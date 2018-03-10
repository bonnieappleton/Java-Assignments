public class IsoscelesTriangle {
    public static void printTriangle(Integer number) {
        for (int i=0; i<number; i++) {
            for (int j=0; j<number-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
