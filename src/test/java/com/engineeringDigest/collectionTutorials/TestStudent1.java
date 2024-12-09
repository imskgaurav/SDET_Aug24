package com.engineeringDigest.collectionTutorials;

import java.util.ArrayList;
import java.util.List;

public class TestStudent1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
       students.add(new Student("Yogesh", 5.55));
        students.add(new Student("Sourabh", 9.12));
        students.add(new Student("Rishita", 6.35));
        students.add(new Student("Alok", 3.35));
       //print the List : As per insertion order
        System.out.println(students);
        /*Use case1: Sort the List, u will get the error */
        /*students.sort(null); */
        /*System.out.println(students); */

        //Use Case2: Print the List : Ascending Order of Gpa
        students.sort((o1,o2)-> (int) (o1.getGpa()- o2.getGpa()));
        System.out.println("Sorting on GPA basis");
        System.out.println(students);
    }
}
