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
public class Node 
{
    int num;
    Node next;
    
    public Node()
    {
        num = 0;
        next = null;
    }
    public Node(int theNum, Node theNext)
    {
        num = theNum;
        next = theNext;
    }
    public int getNum()
    {
        return num;
    }
    public void setNum(int theNum)
    {
        num = theNum;
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node theNext)
    {
        next = theNext;
    }
}
