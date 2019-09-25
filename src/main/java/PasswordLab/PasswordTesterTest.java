package PasswordLab;


import java.util.Scanner;

public class PasswordTesterTest {
    public static void main(String[] args) {
String correctPassword = "password";
Scanner scanner = new Scanner(System.in);
int counter = 0;
boolean flag = true;
while (flag)
{
    System.out.println("what is the password");
    String userInput = scanner.nextLine();

    if (userInput.equals(correctPassword)){
        System.out.println("you are logged in");
        break;
    }
    counter++;
}
        System.out.println(" you had " + counter + " wrong attempts ");




        }
    }


