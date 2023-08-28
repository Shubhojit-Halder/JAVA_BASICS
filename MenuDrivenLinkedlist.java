import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted: " + data);
    }

    public void display() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            System.out.println("Deleted: " + key);
            return;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found. Deletion not possible.");
            return;
        }

        prev.next = current.next;
        System.out.println("Deleted: " + key);
    }
}

public class MenuDrivenLinkedlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int data = scanner.nextInt();
                    linkedList.insert(data);
                    break;
                case 2:
                    linkedList.display();
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int key = scanner.nextInt();
                    if (linkedList.search(key)) {
                        System.out.println(key + " found in the list.");
                    } else {
                        System.out.println(key + " not found in the list.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the element to delete: ");
                    int deleteKey = scanner.nextInt();
                    linkedList.delete(deleteKey);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}