public class Diamond {
    public static void printDiamond(Integer number) {
        boolean increasing = true;
        int i=1;
        while (0<i && i<=number) {
            for (int j=0; j<number-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1; k++) {
                System.out.print("*");
            }

            if (i==number) {
                increasing = false;
            }

            if (increasing == true) {
                i++;
            } else {
                i--;
            }
            System.out.println();
        }
    }
}
