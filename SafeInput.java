import java.util.Scanner;

public class SafeInput {

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" +prompt + ": ");
            retString = pipe.nextLine();
        } while(retString.length() == 0);

        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
            }
        } while (!done);

        return retInt;
    }
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        } while (!done);

        return retVal;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " (" + low + " - " + high + "): ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();

                // Check if it's within the range
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Error: Value must be between " + low + " and " + high);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } while (!done);

        return retVal;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0.0;
        boolean done = false;

        do {

            System.out.print("\n" + prompt + " (" + low + " - " + high + "): ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                // Check if it's within the range
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Error: Value must be between " + low + " and " + high);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (!done);

        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " (Y or N): ");
            String response = pipe.nextLine().trim();

            if (response.equalsIgnoreCase("y")) {
                retVal = true;
                done = true;
            } else if (response.equalsIgnoreCase("n")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("Invalid input. Please enter (Y or N).");
            }
        } while (!done);

        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            String response = pipe.nextLine();

            if (response.matches(regEx)) {
                retVal = response;
                done = true;
            } else {
                System.out.println("Invalid input. Please match the required pattern.");
            }
        } while (!done);

        return retVal;
    }
    public static void prettyHeader(String msg) {
        int totalWidth = 60;

        // 1. Print the top row of 60 asterisks using a loop
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 2. Print the middle row
        System.out.print("***");

        // Calculate padding spaces (total width minus 6 for the 3 left and 3 right stars)
        int contentWidth = totalWidth - 6;
        int totalPadding = contentWidth - msg.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding; // handles odd/even spacing cleanly

        // Print left padding spaces
        for (int i = 0; i < leftPadding; i++) {
            System.out.print(" ");
        }

        // Print the message
        System.out.print(msg);

        // Print right padding spaces
        for (int i = 0; i < rightPadding; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        // 3. Print the bottom row of 60 asterisks using a loop
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
