/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistarray;

/**
 *
 * @author Jonny
 */
public class LinkedListArray 
{
    //int[] a;
    public Node[] a;
    
    public LinkedListArray() 
    {
        //this.a = new int[20];
        this.a = new Node[20];
    }
    
//    public void setNum(int theNum, int theIndex)
//    {
//        a[theIndex] = theNum;
//    }
    
    public void setNext(Node theNext, int theIndex)
    {
        a[theIndex].setNext(theNext);
    }
    
    public void createNode(int theData, int theIndex)
    {
        a[theIndex].setNum(theData);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LinkedListArray l = new LinkedListArray();
        l.createNode(2, 0);
        System.out.print(l.a[0].getNum());
    }

    
    
}
