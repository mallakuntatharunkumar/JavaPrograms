package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.addFirst(5);
        q.addLast(100);

        System.out.println("Queue: " + q);
        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());
        System.out.println(q);
    }
}
