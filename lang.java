// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Student {
//     int rollno;
//     String name, address;

//     public Student(int rollno, String name, String address) {
//         this.rollno = rollno;
//         this.name = name;
//         this.address = address;
//     }

//     public String toString() {
//         return this.rollno + " " + this.name + " " + this.address;
//     }
// }

// class Sortbyroll implements Comparator<Student> {
//     public int compare(Student a, Student b) {
//         return a.rollno - b.rollno;
//     }
// }

// class Sortbyname implements Comparator<Student> {
//     public int compare(Student a, Student b) {
//         return a.name.compareTo(b.name);
//     }
// }

// public class lang {
//     public static void main(String[] args) {
//         ArrayList<Student> ar = new ArrayList<Student>();
//         ar.add(new Student(111, "Mayank", "London"));
//         ar.add(new Student(131, "anshul", "nyc"));
//         ar.add(new Student(121, "Solanki", "Jaipur"));
//         ar.add(new Student(101, "Aggarwal", "Hongkong"));
//         System.out.println("Unsorted");
//         for (int i = 0; i < ar.size(); i++) {
//             System.out.println(ar.get(i));
//         }

//         Collections.sort(ar, new Sortbyroll());
//         System.out.println("\nSorted by rollno");
//         for (int i = 0; i < ar.size(); i++) {
//             System.out.println(ar.get(i));
//         }
//         Collections.sort(ar, new Sortbyname());
//         System.out.println("\nSorted by name");
//         for (int i = 0; i < ar.size(); i++) {
//             System.out.println(ar.get(i));
//         }
//     }
// }



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student {
    int roll;
    String name, address;
//constructor
    public student(int roll, String name, String address) {
        this.roll = roll;
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.roll + " " + this.name + " " + this.address;
    }
}

class Sortbyroll implements Comparator<student> {
    public int compare(student a, student b) {
        return a.roll - b.roll;
    }
}

class Sortbyname implements Comparator<student> {
    public int compare(student a, student b) {
        return a.name.compareTo(b.name);
    }
}

public class lang {
    public static void main(String[] args) {
        ArrayList<student> ar = new ArrayList<>();
        ar.add(new student(1, "jauidj", "Gb"));
        ar.add(new student(2, "ganjali", "Gb1"));
        ar.add(new student(3, "Anjali", "Gb2"));
        
        System.out.println("Unsorted:");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new Sortbyroll());
        System.out.println("\nSorted by roll:");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name:");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}