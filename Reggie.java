import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Get Social Security Number (Pattern: ^\d{3}-\d{2}-\d{4}$)
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (xxx-xx-xxxx)", ssnPattern);
        System.out.println("Valid SSN entered: " + ssn);

        // 2. Get UC Student M-number (Pattern: ^(M|m)\d{5}$)
        String mNumberPattern = "^(M|m)\\d{5}$";
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M-number (M#####)", mNumberPattern);
        System.out.println("Valid M-number entered: " + mNumber);

        // 3. Get Menu Choice (Pattern: ^[OoSsVvQq]$)
        String menuPattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [O=Open, S=Save, V=View, Q=Quit]", menuPattern);
        System.out.println("Valid menu choice entered: " + menuChoice);
    }
}