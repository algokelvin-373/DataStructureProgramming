/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package avltree;

/**
 *
 * @author Acer
 */
public class AVLNode {
    public AVLNode left;
    public AVLNode right;
    public AVLNode parent;
    public int key;
    public int balance;

    public AVLNode(int k) {
        left = right = parent = null;
        balance = 0;
        key = k;
    }

    
    public String toString() {
        return "" + key;
    }
    
    public AVLNode getLeft() {
        return left;
    }
    
    public AVLNode getRight() {
        return right;
    }
    
    public int getData() {
        return key;
    }
}
