package linkedlist;

public interface Interfacelist {

    boolean isEmpty();

    void addFirst(Nodeclass masuk);

    void addLast(Nodeclass masuk);

    void insert(int index, Nodeclass masuk);

    void replace(int oldData, int newData);

    void removeFirst();

    void removeLast();

    void remove(int data);

    void clear();

    void find(int data);

    void printNode();

    int length();
}
