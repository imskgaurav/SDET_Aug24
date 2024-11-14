package org.java.collectionBasics;

import org.checkerframework.checker.units.qual.A;
import org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STUnsignedDecimalNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_Sorting_UsingComparator {


    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(7);
        l1.add(9);
        /*Using Collection Class */
        // Collections.sort(l1);
        System.out.println(l1);
        // For Object comparison , we need to specify the Attribute of Object on which we can sort.
        //So we cabn use Comparator //

        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(l1);
        // If Its Obejct comparison

        List<Student> l2 = new ArrayList<>();
        Student s1 = new Student("Atishay", 16);
        l2.add(s1);
        l2.add(new Student("Mohan", 9));
        l2.add(new Student("Sanjeev", 2));
        l2.add(new Student("Sumit", 7));
        l2.add(new Student("Samita", 7));
        System.out.println(l2);

        l2.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res=o1.rollNum-o2.rollNum;
                if(res==0){

                 return o1.name.compareTo(o2.name);
                }
                return res;
            }

        });

        System.out.println("After Sorting :"+l2);
    }
    }
    class Student{
        int rollNum;
        String name;

        @Override
        public String toString() {
            return "Student{" +
                    "rollNum=" + rollNum +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Student(String name, int rollNum){
            this.name= name;
            this.rollNum= rollNum;
        }

    }
