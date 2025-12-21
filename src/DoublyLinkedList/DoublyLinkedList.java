package DoublyLinkedList;
import java.io.PrintStream;

class DoublyLinkedNode
{
    public int data;
    public DoublyLinkedNode next;
    public DoublyLinkedNode previous;

    public DoublyLinkedNode(int initialData)
    {
        data = initialData;
        next = null;
        previous = null;
    }
}

class DoublyLinkedList
{
    private DoublyLinkedNode head;
    private DoublyLinkedNode tail;

    public DoublyLinkedList()
    {
        head = null;
        tail = null;
    }

    //append operation
    public void append(int item)
    {
        appendNode(new DoublyLinkedNode(item));
    }
    public void appendNode(DoublyLinkedNode newNode)
    {
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }

    //prepend operation
    public void prepend(int item)
    {
        prependNode(new DoublyLinkedNode(item));
    }
    public void prependNode(DoublyLinkedNode newNode)
    {
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
    }

    //print operation
    public void print(PrintStream out)
    {
        DoublyLinkedNode node = head;
        if (node != null)
        {
            out.print(node.data);
            node = node.next;
        }

        while (node != null)
        {
            out.print(", " + node.data);
            node = node.next;
        }
        out.println();
    }
}
