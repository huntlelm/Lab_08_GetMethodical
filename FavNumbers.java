import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get favorite integer using getInt
        int favInt = SafeInput.getInt(in, "Enter your favorite integer");

        // Get favorite double using unconstrained getDouble
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");

    }
}