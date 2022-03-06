package stacklinklist;

import java.util.Scanner;

public class DS_StackLinkList {
    public static void main(String[] args) {
        int again;
        StackLinkListCode llist = new StackLinkListCode();
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Push data.");
            System.out.println("2. Pop data.");
            System.out.println("3. Display data.");
            Scanner masukan = new Scanner(System.in);
            int input = masukan.nextInt();
            switch (input) {
                case 1 : {
                    System.out.println("Enter the data!");
                    Scanner inputan = new Scanner (System.in);
                    int data = inputan.nextInt();
                    llist.push(data);
                } break;
                case 2 : {
                    System.out.println("Data has been popped!");
                    llist.pop();
                } break;
                case 3 : {
                    System.out.println("The data : ");
                    llist.print();
                } break;
            }
            System.out.println("Again?");
            System.out.println("1.Again || 2. Quit");
            Scanner lagi = new Scanner (System.in);
            again = lagi.nextInt();
        } while (again == 1);
    }
}
