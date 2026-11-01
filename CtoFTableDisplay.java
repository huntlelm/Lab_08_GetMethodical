public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-10s | %-10s%n", "Celsius", "Fahrenheit");
        System.out.println("----------------------------");

        // Loop from -100 to 100 degrees Celsius in 1-degree increments
        for (double c = -100; c <= 100; c++) {
            double f = CtoF(c);
            System.out.printf("%-10.2f | %-10.2f%n", c, f);
        }
    }

    /**
     * Converts a Celsius temperature to Fahrenheit.
     * @param Celsius temperature in Celsius
     * @return equivalent temperature in Fahrenheit
     */
    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }
}