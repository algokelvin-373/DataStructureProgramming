
package stackusingarray;
import java.util.Scanner;
public class StackUsingArray {

    public static void main(String[] args) {
        ArrayStack astack = new ArrayStack();
        int again;
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
                    astack.push(data);
                    System.out.println("Again?");
                    
                } break;
                case 2 : 
                {
                    astack.pop();
                    System.out.println("Data has been popped!");
                    System.out.println("Again?");
                } break;
                case 3 : 
                {
                    //astack.makeEmpty();
                    //System.out.println("Data has been cleared!");
                    //System.out.println("Again?");
                } break;
                case 4 :
                {
                    System.out.println("The data : ");
                    astack.print();
                    System.out.println("Again?");
                } break;
                case 5 :
                {
                    //System.out.println("The top data is : ");
                    //astack.top();
                    //System.out.println("Again?");
                } break;
                case 6 : 
                {
                    System.out.println("Please enter 2 to proceed, enter 1 to abort!");
                } break;
            }
            System.out.println("1.Again || 2. Quit");
            Scanner lagi = new Scanner (System.in);
            again = lagi.nextInt();
        } while ( again == 1 );
        
    } 
    
}
