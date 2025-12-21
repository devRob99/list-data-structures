package SinglyLinkedList;
import java.io.PrintStream;

// created SinglyLinkedNode class
class SinglyLinkedNode
{
    public int data;
    public SinglyLinkedNode next;

    public SinglyLinkedNode(int initialData)
    {
        data = initialData;
        next = null;
    }
}

// created SinglyLinkedList class
class SinglyLinkedList
{
    private SinglyLinkedNode head;
    private SinglyLinkedNode tail;

    public SinglyLinkedList()
    {
        head = null;
        tail = null;
    }

    // append operation
    public void append(int item)
    {
        appendNode(new SinglyLinkedNode(item));
    }
    public void appendNode(SinglyLinkedNode newNode)
    {
        if (head ==null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // prepend operation
    public void prepend (int item) {
        prependNode(new SinglyLinkedNode(item));
    }
    public void prependNode(SinglyLinkedNode newNode)
    {
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    // print operation
    public void print(PrintStream out)
    {
        SinglyLinkedNode node = head;

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
