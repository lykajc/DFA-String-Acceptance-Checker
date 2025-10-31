import java.util.Scanner;

public class LabAct_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter any binary string or (type exit to quit): ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbyee poo.....");
                break;
            }

            // 0 AND 1 ONLY
            if (!input.matches("[01]+")) {
                System.out.println("Invalid input! Please enter only 0s and 1s.\n");
                continue;
            }

            // END STATE
            var state = getString(input);

            // ACCEPT OR REJECT THE STRING
            if (state.equals("q2")) {
                System.out.println("Result: Accepted\n");
            } else {
                System.out.println("Result: Rejected\n");
            }
        }
    }

    private static String getString(String input) {

        String start = "q0";

        // Process input string
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            switch (start) {
                case "q0":
                    if (symbol == '0') start = "q1";
                    else start = "q0";
                    break;

                case "q1":
                    if (symbol == '0') start = "q1";
                    else start = "q2";
                    break;

                case "q2":
                    if (symbol == '0') start = "q1";
                    else start = "q0";
                    break;
            }
        }
        return start;
    }
}
