public class Main {

    // Height of the diamond pattern
    private static final int DIAMOND_HEIGHT = 5;

    public static void main(String[] args) {

        // Upper half of the diamond
        for (int i = 1; i <= DIAMOND_HEIGHT; i++) {

            for (int j = i; j < DIAMOND_HEIGHT; j++) {
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

        // Lower half of the diamond
        for (int i = DIAMOND_HEIGHT - 1; i >= 1; i--) {

            for (int j = DIAMOND_HEIGHT; j > i; j--) {
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
