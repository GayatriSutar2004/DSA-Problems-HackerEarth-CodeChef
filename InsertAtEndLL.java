✅ Question 2: Insert a node at the tail of a linked list
Problem Statement:

You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node.
The given head pointer may be null, meaning that the initial list is empty.

✨ Function Description
Complete the function insertNodeAtTail with the following parameters:

head: a reference to the head of a list

data: the data value for the node to insert

Returns:

SinglyLinkedListNode pointer: reference to the head of the modified linked list


import java.util.*;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void printList(SinglyLinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class Result {
    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinglyLinkedList llist = new SinglyLinkedList();
        int n = scanner.nextInt(); // Number of elements to insert

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            llist.head = Result.insertNodeAtTail(llist.head, data);
        }

        llist.printList(llist.head);
        scanner.close();
    }
}
