package com.engineeringDigest.collectionTutorials;

 class Student {
     public String getName() {
         return name;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", gpa=" + gpa +
                 '}';
     }

     public double getGpa() {
         return gpa;
     }

     private  String name;

     private  double gpa;

     public Student(String name, double gpa){

         this.gpa = gpa;
         this.name= name;


     }
}
