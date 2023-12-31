package week12;

import java.util.Random;

public class RandomList {

    private class Node {
        int value;
        Node next;
    }

    private Node head;

    public RandomList(int bound, int size) {
        Random random = new Random();
        head = new Node();
        Node current = head;

        for (int i = 0; i < size; i++) {
            current.value = random.nextInt(bound);
            if (i < size - 1) {
                current.next = new Node();
                current = current.next;
            }
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        Node current = head;
//
//        while (current != null) {
//            result.append(current.value).append(" ");
//            current = current.next;
//        }
//
//        return result.toString().trim();
//    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }

        return result.toString().trim();
    }

    public void removeAdjacentDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void removeAdjacentDuplicatesR() {
        head = removeAdjacentDuplicatesRecursive(head);
    }

    private Node removeAdjacentDuplicatesRecursive(Node current) {
        if (current == null || current.next == null) {
            return current;
        }

        if (current.value == current.next.value) {
            return removeAdjacentDuplicatesRecursive(current.next);
        } else {
            current.next = removeAdjacentDuplicatesRecursive(current.next);
            return current;
        }
    }

    public int getMax() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int max = head.value;
        Node current = head.next;

        while (current != null) {
            if (current.value > max) {
                max = current.value;
            }
            current = current.next;
        }

        return max;
    }

    public void removeMaxValues() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int max = getMax();
        Node dummy = new Node();
        dummy.next = head;
        Node current = dummy;

        while (current.next != null) {
            if (current.next.value == max) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        head = dummy.next;
    }

    public static void main(String[] args) {
        RandomList list = new RandomList(4, 15);
        System.out.println("Random list:" + System.lineSeparator() + list + System.lineSeparator());
        list.removeAdjacentDuplicates();
        System.out.println("List with adjacent duplicates removed:" +
                System.lineSeparator() + list + System.lineSeparator());

        RandomList list2 = new RandomList(4, 15);
        System.out.println("Another Random list:" + System.lineSeparator() + list2 + System.lineSeparator());
        list2.removeAdjacentDuplicatesR();
        System.out.println("List with adjacent duplicates removed recursively:" +
                System.lineSeparator() + list2 + System.lineSeparator());

        RandomList list3 = new RandomList(4, 15); // make a new list
        System.out.println("A Third Random list:" + System.lineSeparator() + list3 + System.lineSeparator());
        System.out.println("Successively removing max values:");
        while (!list3.isEmpty()) {
            list3.removeMaxValues();
            System.out.println(list3);
        }
    }
}
