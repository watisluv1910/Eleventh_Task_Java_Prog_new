package org.application.fifthTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListComparator {

    ArrayList<Integer> arrayList;
    LinkedList<Integer> linkedList;

    long startTime, estimatedTime;

    static Random random = new Random();

    public ListComparator() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(100));
            linkedList.add(arrayList.get(arrayList.size() - 1));
        }
    }

    public String compareInsertion() {

        startTime = System.currentTimeMillis();
        arrayList.add(arrayList.size() / 2 + 1, 125);
        estimatedTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        linkedList.add(linkedList.size() / 2 + 1, 125);
        startTime = System.currentTimeMillis() - startTime;

        if (estimatedTime < startTime) {
            return "ArrayList";
        } else if (estimatedTime > startTime) {
            return "LinkedList";
        } else {
            return "Equal";
        }
    }

    public String compareDeletion() {

        startTime = System.currentTimeMillis();
        arrayList.remove(arrayList.size() / 2);
        estimatedTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        linkedList.remove(linkedList.size() / 2);
        startTime = System.currentTimeMillis() - startTime;

        if (estimatedTime < startTime) {
            return "ArrayList";
        } else if (estimatedTime > startTime) {
            return "LinkedList";
        } else {
            return "Equal";
        }
    }

    public String compareSearch() {

        startTime = System.currentTimeMillis();
        arrayList.indexOf(125);
        estimatedTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        linkedList.indexOf(125);
        startTime = System.currentTimeMillis() - startTime;

        if (estimatedTime < startTime) {
            return "ArrayList";
        } else if (estimatedTime > startTime) {
            return "LinkedList";
        } else {
            return "Equal";
        }
    }
}
