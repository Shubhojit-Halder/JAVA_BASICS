import java.util.Scanner;

class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node1 head;
    private Node1 tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int Length() {
        int len = 0;
        Node1 temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void insertAtBeginning(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Inserted at the beginning: " + data);
    }

    public void insertAtEnd(int data) {
        Node1 newNode = new Node1(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Inserted at the end: " + data);
    }

    public void delete(int data) {
        Node1 current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Deleted: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found. Deletion not possible.");
    }

    public void insertAtPos(int data, int pos) {

        if (pos > Length() + 1) {
            System.out.println("Enter a valid Position!!");
            return;
        }
        else if (pos == 1)
            insertAtBeginning(data);
        else if (pos == Length() + 1)
            insertAtEnd(data);
        else {
            Node1 newNode = new Node1(data);
            Node1 temp = head;
            while (pos > 2) {
                temp = temp.next;
                pos--;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    public void displayForward() {
        Node1 current = head;
        System.out.print("List (Forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        Node1 current = tail;
        System.out.print("List (Reverse): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class MenuDrivenDoublyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete");
            System.out.println("4. Display forward");
            System.out.println("5. Display reverse");
            System.out.println("6. Check if empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at the beginning: ");
                    int dataAtBeginning = scanner.nextInt();
                    dll.insertAtBeginning(dataAtBeginning);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at the end: ");
                    int dataAtEnd = scanner.nextInt();
                    dll.insertAtEnd(dataAtEnd);
                    break;
                case 3:
                    System.out.print("Enter the element to delete: ");
                    int deleteData = scanner.nextInt();
                    dll.delete(deleteData);
                    break;
                case 4:
                    dll.displayForward();
                    break;
                case 5:
                    dll.displayReverse();
                    break;
                case 6:
                    if (dll.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("List is not empty.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                case 8:
                    System.out.println("Enter number and position: ");
                    int dataP = scanner.nextInt();
                    int position = scanner.nextInt();
                    dll.insertAtPos(dataP, position);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}