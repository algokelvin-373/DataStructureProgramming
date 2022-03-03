package linkedlist;

import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {
        Linklist link = new Linklist();
        Scanner masuk = new Scanner(System.in);
        do {
            System.out.print("\nPilihan Menu:\n"
                    + "1. Add First\n"
                    + "2. Add Last\n"
                    + "3. Remove First\n"
                    + "4. Remove Last\n"
                    + "5. Find\n"
                    + "6. Print Node\n"
//                    + "7. Insert\n" --> abaikan saja, karena bisa merusak linklist
//                    + "8. Replace\n"  --> mengedit data
//                    + "9. Remove\n" --> menghapus data tertentu
                    + "10. Clear\n"
                    // + "11. Length\n"
                    + "12. Exit\n"
                    + "Pilihan anda: ");

            int pilih = masuk.nextInt();
            switch (pilih) {
                case 1: {
                    System.out.print("Masukkan nilai : ");
                    Nodeclass n = new Nodeclass();
                    int temp = masuk.nextInt();
                    n.data = temp;
                    link.addFirst(n);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan nilai : ");
                    Nodeclass n = new Nodeclass();
                    int temp = masuk.nextInt();
                    n.data = temp;
                    link.addLast(n);
                    break;
                }
                case 3: {
                    link.removeFirst();
                    break;
                }
                case 4: {
                    link.removeLast();
                    break;
                }
                case 5: {
                    System.out.print("Mencari data : ");
                    int data = masuk.nextInt();
                    link.find(data);
                    break;
                }
                case 6: {
                    System.out.println("Daftar data : ");
                    link.printNode();
                    break;
                }
//                case 7: {
//                    System.out.print("Masukkan indeks yang akan ditambahkan : ");
//                    int indek = masuk.nextInt();
//                    System.out.print("Masukkan nilai : ");
//                    Nodeclass n = new Nodeclass();
//                    int temp = masuk.nextInt();
//                    n.data = temp;
//                    link.insert(indek, n);
//                    break;
//                }
//                case 8: {
//                    System.out.print("Data yang akan diganti : ");
//                    int data = masuk.nextInt();
//                    System.out.print("Masukkan nilai : ");
//                    int temp = masuk.nextInt();
//                    int n = temp;
//                    link.replace(data, n);
//                    break;
//                }
//                case 9: {
//                    System.out.print("Masukkan data yang akan dihapus : ");
//                    int data = masuk.nextInt();
//                    int n = data;
//                    link.remove(n);
//                    System.out.println("Data berhasil dihapus.");
//                    break;
//                }
                case 10: {
                    link.clear();
                    System.out.println("Semua data berhasil dihapus.");
                    break;
                }
                case 11: {
                    System.out.println("Panjang data : ");
                    System.out.println(link.length());
                    break;
                }
                case 12: {
                    System.out.println("Anda telah keluar.");
                    System.exit(0);
                }
                default: {
                    System.out.println("Pilihan anda tidak ada, Silahkan ulangi lagi.");
                }
            }
        } while (true);
    }
}
