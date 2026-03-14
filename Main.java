public class Main {

    // Height of the diamond pattern
    private static final int PATTERN_HEIGHT = 5;

    public static void main(String[] args) {

        // Upper part of diamond
        for (int i = 1; i <= PATTERN_HEIGHT; i++) {

            for (int j = i; j < PATTERN_HEIGHT; j++) {
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

        // Lower part of diamond
        for (int i = PATTERN_HEIGHT - 1; i >= 1; i--) {

            for (int j = PATTERN_HEIGHT; j > i; j--) {
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
