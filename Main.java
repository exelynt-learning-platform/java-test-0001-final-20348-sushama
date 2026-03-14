public class Main {

    private static final int ROWS = 5;

    public static void main(String[] args) {

        // upper part
        for (int i = 1; i <= ROWS; i++) {

            for (int j = i; j < ROWS; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // lower part
        for (int i = ROWS - 1; i >= 1; i--) {

            for (int j = ROWS; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
