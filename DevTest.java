import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        // getRegExString
        Scanner pipe = new Scanner(System.in);
        String prompt = "Enter your student ID (M########)";
        String regExPattern = "^(M|m)\\d{8}$";

        String studentID = SafeInput.getRegExString(pipe, prompt, regExPattern);

    }
}