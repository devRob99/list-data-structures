package DoublyLinkedList;

public class main
{
    public static void main(String[] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        list.prepend(22);

        list.print(System.out);
    }
}
