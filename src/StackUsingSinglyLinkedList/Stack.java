package StackUsingSinglyLinkedList;

import java.io.PrintStream;

class StackNode
{
    public int data;
    public StackNode next;

    public StackNode(int dataValue, StackNode nextNode)
    {
        data = dataValue;
        next = nextNode;
    }
}

class Stack
{
    private StackNode top;

    public Stack()
    {
        top = null;
    }

    public void push(int newData)
    {
        top = new StackNode(newData, top);
    }

    public int pop()
    {
        // Copy top node's data
        int poppedItem = top.data;

        // Remove top node
        top = top.next;

        // Return the popped item
        return poppedItem;
    }

    // Added peek feature
    public int peek()
    {
        return top.data;
    }

    // isEmpty feature
    public boolean isEmpty()
    {
        return top == null;
    }

    public void print(PrintStream out)
    {
        StackNode node = top;
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

