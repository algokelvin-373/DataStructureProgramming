package stack.stackarray;

import java.util.Scanner;

public class DS_StackArray extends StackController {
    private static int again = 1;
    private static Scanner input = new Scanner(System.in);
    private static int data;

    public static void main(String[] args) {
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Push data.");
            System.out.println("2. Pop data.");
            System.out.println("3. Display data.");
            System.out.print("Input: ");
            data = input.nextInt();
            switch (data) {
                case 1: {
                    System.out.print("Enter the data = ");
                    data = input.nextInt();
                    stack.push(data);
                    break;
                }
                case 2: {
                    stack.pop();
                    System.out.println("Data has been popped!");
                    break;
                }
                case 3: {
                    System.out.println("The data : ");
                    stack.print();
                    break;
                }
            }
            System.out.println("1.Again || 2. Quit");
            System.out.print("Again? ");
            Scanner inputAgain = new Scanner (System.in);
            again = inputAgain.nextInt();
        } while (again == 1);
    }
}
