
package stackusinglinklist;

public class StackLinkList implements IStack{

    private item top;
    private item bottom;
    
    public StackLinkList() // constructor
    {
        top = bottom = null; // no items on list yet
    }
    
    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if(top == null){
            empty = true;   
        } 
            return empty;
    }

    @Override
    public void push(int data) {
        item newitem = new item (data);
        if(top == null){
            top = bottom = newitem;
        }
        else {
            top.next = newitem;
            newitem.prev = top;
            top = newitem;
        }
    }

    @Override
    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else {
        item temp = null;
            if(top==bottom) {
                temp = top;
                top = bottom = null;
            }
            else {
                temp = top;
                top = top.prev;
                top.next = null;
            }
        }
    }

    @Override
    public void makeEmpty() {
        //isi sendiri ... :3
    }

    @Override
    public void print() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else {
            item current = bottom;
            while ( current != null){
                current.displayLink();
                current = current.next;
            }
        }
        System.out.println("");
    }
    
    @Override
    public void top() {
        //isi sendiri juga ... :3
    }
}
