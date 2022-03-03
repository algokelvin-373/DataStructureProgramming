
package sdaqueuelist;

public interface Queue {
    boolean isEmpty();
    void makeEmpty();
    void enqueue(int data);
    int dequeue();
    void print();
}
