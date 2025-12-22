package StackUsingSinglyLinkedList;

public class main
{
    public static void main(String[] args)
    {
        int[] numbers = { 70, 40, 10};

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

    }
}
