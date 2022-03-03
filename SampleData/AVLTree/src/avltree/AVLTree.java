/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avltree;

import java.util.*;

/**
 *
 * @author Acer
 */
public class AVLTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATree Call = new ATree();
        //ATree s = new ATree();
        for (int i = 1; i > 0; i++) {
            menuPilihan();
            int p = scan.nextInt();
            switch (p) {
                case 1: {
                    System.out.println("Masukkan Node : ");
                    int k = scan.nextInt();
                    Call.insert(k);
                    break;
                }
                case 2: {
                    System.out.println("Masukkan Node yang ingin dihapus : ");
                    int k = scan.nextInt();
                    Call.remove(k);
                    break;
                }
                case 3: {

                    System.out.println("Mencetak Node Pre - Order : ");
                    Call.showPreOrder();
                    //System.out.println("In-Order : " + Call.inorder());
                    break;
                }
                case 4: {
                    System.out.println("Mencetak Node In - Order : ");
                    Call.showInOrder();
                    break;
                }
                case 5: {
                    System.out.println("Mencetak Node Post - Order : ");
                    Call.showPostOrder();
                    break;
                }
                case 6: {
                    System.out.println("Proses diakhiri");
                }
                default:
                    break;
            }
            if (p == 6) {
                break;
            }
        }
    }

    public static void menuPilihan() {
        System.out.println("\n\nMenu Pilihan ");
        System.out.println("1. Input Node ");
        System.out.println("2. Remove Node ");
        System.out.println("3. Show Pre - Order AVLTree ");
        System.out.println("4. Show In - Order AVLTree");
        System.out.println("5. Show Post - Order AVLTree");
        System.out.println("6. Exit ^__^ ");
        System.out.println("Please, input your choice :");
    }
}
