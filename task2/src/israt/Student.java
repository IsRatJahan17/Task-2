package israt;

public class Student {

    int id;
    String name;
    static String universityName;

    Student() //Default Constructor
    {
        universityName = "Leading University";
    }

    Student(String name) {
        this.name = name;
        System.out.println("Student's Name: " + name);
    }

    Student(int id) {
        this.id = id;
        System.out.println("Student's ID: " + id);
    }

    void display() {
        System.out.println("University Name: " + universityName);
    }
}

/*
    Name: Israt Jahan
    ID: 2012020163
    Section: D
    Email: cse_2012020163@lus.ac.bd
    Date: 07-08-2021
 */

