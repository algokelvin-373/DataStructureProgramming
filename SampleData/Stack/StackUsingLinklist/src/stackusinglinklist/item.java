
package stackusinglinklist;

public class item {
    public int data;
    int num;
    public item next;
    public item prev;
    public item (int id){
        data = id;
        num = id;
        next = null;
    }
    public void displayLink() {
        System.out.println("{ " + data + " }");
    }
}
