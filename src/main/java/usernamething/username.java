package usernamething;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        String correctUsername = "alice";
        String correctUsername1 = "bob";
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (true) {
            System.out.println("whats your name");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase(correctUsername)) {
                System.out.println("welcome");
                break;

            } else if (userInput.equalsIgnoreCase(correctUsername1)) {
                System.out.println("welcome");
                break;
            }
            counter++;
        }
    }
}
