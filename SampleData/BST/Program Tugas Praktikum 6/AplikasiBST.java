package Tugas_Praktikum6;

import java.util.Scanner;
public class AplikasiBST {
    public static void main (String [] args) {
        int a;
        Scanner masukan = new Scanner (System.in);
        ProsesBST BST = new ProsesBST ();
        MenuPilihan();
        do {
            System.out.print ("Silahkan Pilih :");
            int pilih = masukan.nextInt();
            switch (pilih) {
                case 1  : System.out.print ("Masukan Angka : ");
                          a = masukan.nextInt();
                          BST.insert(a);
                          break;
                case 2  : System.out.print ("Masukan Angka Yang "+
                            "Ingin Dihapus : ");
                          a = masukan.nextInt();
                          BST.delete(a);
                          break;
                case 3  : System.out.print ("Masukan Angka : ");
                          a = masukan.nextInt();
                          BST.find(a);
                          break;
                case 4  : BST.deleteAll();
                          break;
                case 5  : System.out.println ("Hasil Tampilan Pre-order :");
                          BST.preorder();
                          break;
                case 6  : System.out.println ("Hasil Tampilan In-order :");
                          BST.inorder();
                          break;
                case 7  : System.out.println ("Hasil Tampilan Post-order : ");
                          BST.postorder();
                          break;
                case 8  : System.out.println ("\nBanyak Daun = "+BST.leaf());
                          break;
                case 9  : System.out.println ("\nBanyak node = "+BST.getUkuran());
                          break;
                case 10 : System.out.print ("Masukan Angka : ");
                          a = masukan.nextInt();
                          BST.CariTerdekat(a);
                          break;
                case 11 : System.out.println ("See You Next Time\n");
                          System.exit(0);
                          break;
                default : System.out.println ("Maaf, pilihan anda salah\n");
            }
        }
        while (true);
    }
    public static void MenuPilihan () {
        System.out.println ("Menu :");
        System.out.println ("1  = Masukan Data");
        System.out.println ("2  = Hapus Data");
        System.out.println ("3  = Mencari Data Yang Diinput");
        System.out.println ("4  = Menghapus Semua Data");
        System.out.println ("5  = Menampilkan Pohon secara Pre-order");
        System.out.println ("6  = Menampilkan Pohon secara In-order");
        System.out.println ("7  = Menampilkan Pohon secara Post-order");
        System.out.println ("8  = Jumlah daun pada pohon");
        System.out.println ("9  = Jumlah node pada pohon");
        System.out.println ("10 = Mencari data terdekat dari inputan");
        System.out.println ("11 = Keluar");
    }
}
