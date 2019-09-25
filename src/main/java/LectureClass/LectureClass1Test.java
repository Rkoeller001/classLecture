package LectureClass;

import java.util.Scanner;

public class LectureClass1Test {
    public static void main(String[] args) {
        LectureClass1 cost1 = new LectureClass1("milk eggs cheese",0.00,0.00);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is that all?");
        String cost = scanner.nextLine();
//      System.out.println("Your total for today is" + " " +);
        System.out.println("Your total for today is");
        cost1.itemsCost();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome, what's your name?");
//        String shortyName = scanner.nextLine();
//        System.out.println("Nice to meet ya"  + " " + shortyName);
//        System.out.println("What's your number?");
//        String shortyNumber = scanner.nextLine();
//        System.out.println("My number is" + " " + shortyNumber);
//        double twoNumbers = scanner.nextDouble();



//        LectureClass1 person1 = new LectureClass1("ryan",30.00);
//        System.out.println(person1.getName());
    }
}
