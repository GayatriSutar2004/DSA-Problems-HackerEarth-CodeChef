✅ Question:
You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

💡 Function Description
Complete the function insertNodeAtTail with the following parameters:

SinglyLinkedListNode head: a reference to the head of a list

int data: the data value for the node to insert

Returns:
SinglyLinkedListNode: reference to the head of the modified linked list

📥 Input Format:
The first line contains an integer n, the number of elements in the linked list.

The next n lines contain an integer each — the values that need to be inserted at the tail.

📈 Constraints:
1 <= n <= 1000

Each value is a valid 32-bit integer.

import java.util.Scanner;

class Solution {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to insert node at tail
    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    // Function to print the linked list
    public static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        SinglyLinkedListNode head = null;

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            head = insertNodeAtTail(head, data);
        }

        printLinkedList(head);
        scanner.close();
    }
}
