package Tugas_Praktikum6;

public class Nodeclass {
    int angka;
    Nodeclass orangtua, kiri, kanan;
    
    public Nodeclass (int data) {
        this.angka = data;
        orangtua = kiri = kanan = null;
    }
    public Nodeclass getKiri () {
        return kiri;
    }
    public Nodeclass getKanan () {
        return kanan;
    }
    public int getData () {
        return angka;
    }
    public void setKiri (Nodeclass n) {
        kiri = n;
    }
    public void setKanan (Nodeclass n) {
        kanan = n;
    }
}
