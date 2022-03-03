
package stackusinglinklist;

import java.util.Scanner;

public class StackUsingLinklist {

    public static void main(String[] args) {
        int again;
        StackLinkList llist = new StackLinkList();
        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Push data.");
            System.out.println("2. Pop data.");
            //System.out.println("3. Empty data.");
            System.out.println("4. Display data.");
            //System.out.println("5. Top data.");
            System.out.println("6. Exit program.");
            Scanner masukan = new Scanner(System.in);
            int input = masukan.nextInt();
            switch (input) {
                case 1 : 
                {
                    System.out.println("Enter the data!");
                    Scanner inputan = new Scanner (System.in);
                    int data = inputan.nextInt();
                    llist.push(data);
                    System.out.println("Again?");
                } break;
                case 2 : 
                {
                    System.out.println("Data has been popped!");
                    llist.pop();
                    System.out.println("Again?");
                } break;
                case 3 : 
                {
                    System.out.println("Data has been cleared!");
                    //llist.makeEmpty();
                    System.out.println("Again?");
                } break;
                case 4 :
                {
                    System.out.println("The data : ");
                    llist.print();
                    System.out.println("Again?");
                } break;
                case 5 :
                {
                    System.out.println("The top data is : ");
                    //llist.top();
                    System.out.println("Again?");
                } break;
                case 6 : 
                {
                    System.out.println("Please enter 2 to proceed, enter 1 to abort!");
                } break;
            }
            System.out.println("1.Again || 2. Quit");
            Scanner lagi = new Scanner (System.in);
            again = lagi.nextInt();
        } while (again == 1);
    }
    
}
