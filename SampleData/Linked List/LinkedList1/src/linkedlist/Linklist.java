package linkedlist;

public class Linklist implements Interfacelist {

    Nodeclass head;
    Nodeclass tail;

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public void addFirst(Nodeclass masuk) {
        if (isEmpty()) {
            head = masuk;
            tail = masuk;
        } else {
            masuk.next = head;
            head = masuk;
        }
    }
    
    @Override
    public void addLast(Nodeclass masuk) {
        if (isEmpty()) {
            head = masuk;
            tail = masuk;
        } else {
            tail.next = masuk;
            tail = masuk;
        }
    }

    @Override
    public void removeFirst() {
        Nodeclass temp = head;
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = temp.next;
                temp.next = null;
                temp = null;
            }
            System.out.println("Data pertama telah dihapus.");
        } else {
            System.out.println("Data Kosong!");
        }
    }

    @Override
    public void removeLast() {
        Nodeclass temp = head;
        if (!isEmpty()) {
            if (tail == head) {
                head = tail = null;
            } else {
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                //temp = null;
            }
            System.out.println("Data terakhir telah dihapus.");
        } else {
            System.out.println("Data Kosong!");
        }
    }

    @Override
    public void find(int data) {
        int i = 0;
        boolean found = false;
        Nodeclass temp = head;
        while (temp != null) {
            if (temp.data == data) {
                found = true;
                System.out.println("Data ditemukkan diindeks ke " + i);
                break;
            }
            i++;
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    @Override
    public void printNode() {
        Nodeclass temp;
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public void insert(int index, Nodeclass masuk) {
        Nodeclass temp = head;
        boolean found = false;
        int i = 0;
        int indek = index - 1;
        if (index == 0) {
            masuk.next = head;
            head = masuk;
        } else {
            do {
                if (i == indek) {
                    found = true;
                    masuk.next = temp.next;
                    temp.next = masuk;
                    System.out.println("Data berhasil dimasukkan.");
                    break;
                } else {
                    i++;
                    temp = temp.next;
                }
            } while (temp != null);
        }
    }

    @Override
    public void replace(int oldData, int newData) {
        Nodeclass temp = head;
        do {
            if (temp.data == oldData) {
                temp.data = newData;
                System.out.println("Data berhasil diganti.");
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    @Override
    public void remove(int data) {
        Nodeclass temp = head;
        if (!isEmpty()) {
            do {
                if (temp.next.data == data) {
                    temp.next = temp.next.next;
                    break;
                } else if ((temp.data == data) && (temp == head)) {
                    this.removeFirst();
                    break;
                }
                temp = temp.next;
            } while (temp != null);
        } else {
            System.out.println("Data kosong!");
        }
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public int length() {
        Nodeclass temp = head;
        int hitung = 0;
        while (temp != null) {
            hitung++;
            temp = temp.next;
        }
        return hitung;
    }
}
