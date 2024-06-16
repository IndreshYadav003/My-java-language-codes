package heaps;
import  java.util.*;
public class maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer>hp=new PriorityQueue<>(Collections.reverseOrder());//max heap
        hp.add(42);
        System.out.println(hp);
        hp.add(99);
        System.out.println(hp);
        hp.add(33);
        hp.add(3);
        hp.add(1);
        System.out.println(hp);
        System.out.print("size of heap"+hp.size());
        System.out.println("peek element of heap"+hp.peek());

        hp.remove();
        hp.remove();
        System.out.println(hp);
        System.out.print("size of heap"+hp.size());
        System.out.println("peek element of heap"+hp.peek());
    }
    }

