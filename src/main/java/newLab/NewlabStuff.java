package newLab;
//Write a guessing game which prompts a user to guess a mystery number within some range.
//After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//Upon termination, the program should display the number of guesses before successfully guessing correctly.
//To establish familiarity with
//Control Flow
//Conditionals
//User input
//The Random class
//Object instantation/declaration
//Method invokation

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NewlabStuff {
    public static void main(String[] args) {
        Random number = new Random();
        Set<Integer> a = new HashSet<Integer>();
        int userGuess = number.nextInt(15);
        int numberOfAttempts = 0;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (!win) {
            System.out.println("start guessing");
            guess = scanner.nextInt();



            if (guess == userGuess) {
                System.out.println("it took you " + a.size() + " times");
                System.out.println(a.toString());
                win = true;
            } else if (guess < userGuess) {

                System.out.println("your number is to low");
                a.add(guess);
            } else if (guess > userGuess) {
                a.add(guess);
                System.out.println("your number is to high" + a.toString());
            }
        }


        System.out.println("you win");

        System.out.println("the number was " + userGuess);



    }
}

