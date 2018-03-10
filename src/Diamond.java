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

    //If a name parameter is provided, the diamond prints the name in the centre of the diamond

    public static void printDiamond(Integer number, String name) {
        boolean increasing = true;
        int i=1;
        while (0<i && i<=number) {
            for (int j=0; j<number-i; j++) {
                System.out.print(" ");
            }

            if (i==number) {
                increasing = false;
                System.out.print(name);
            } else {
                for (int k=0; k<2*i-1; k++) {
                    System.out.print("*");
                }
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
