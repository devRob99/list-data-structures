package StackUsingSinglyLinkedList;

import static java.lang.reflect.Array.getLength;

public class main
{
    public static void main(String[] args)
    {
        int[] numbers = { 70, 40, 10, 60, 12, 5, 2};

        Stack numStack = new Stack();
        for (int number : numbers)
        {
            numStack.push(number);
        }

        numStack.push(90);

        numStack.pop();
        numStack.pop();

        System.out.println("Stack: ");
        numStack.print(System.out);

        System.out.println(numStack.peek());

        if  (numStack.isEmpty() == true)
        {
            System.out.println("Stack is empty");
        }

        System.out.println(numStack.getLength());
    }
}
