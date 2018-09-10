package com.mxninja.competitiveProgramming.hackerrank;

import java.util.*;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

    static class Priorities {


        public List<Student> getStudents(List<String> events) {
            PriorityQueue<Student> pq = new PriorityQueue<>();
            StringTokenizer tokenizer;
            for (String str : events) {
                tokenizer = new StringTokenizer(str);
                String event = tokenizer.nextToken();
                if (event.equals("SERVED")) {
                    pq.poll();
                } else {
                    String name = tokenizer.nextToken();
                    double cgpa = Double.parseDouble(tokenizer.nextToken());
                    int id = Integer.parseInt(tokenizer.nextToken());
                    pq.offer(new Student(id, name, cgpa));
                }
            }
            List<Student> students = new ArrayList<>();
            while (!pq.isEmpty()) {
                students.add(pq.poll());
            }
            return students;
        }
    }

    static class Student implements Comparable<Student> {
        private int id;
        private String name;
        private double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student o) {
            if (cgpa > o.cgpa) {
                return -1;
            } else if (cgpa == o.cgpa && name.compareTo(o.name) < 0) {
                return -1;
            } else if (cgpa == o.cgpa && name.compareTo(o.name) == 0 && id < o.id) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
