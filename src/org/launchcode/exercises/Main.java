package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        double result1 = Divide(40,2);
        double result2 = Divide(40,0);

        System.out.println("40 / 2 = " + result1);
        System.out.println("40 / 0 = " + result2);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");



        // Test out your CheckFileExtension() function!

        int carlsGrade = CheckFileExtension(studentFiles.get("Carl"));
        System.out.println(carlsGrade);

        int bradsGrade = CheckFileExtension(studentFiles.get("Brad"));
        System.out.println(bradsGrade);


    }

    public static double Divide(double x, double y) {

        if (y == 0) {
            try {
                throw new ArithmeticException("Can't divide by zero bruh!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // CheckFileExtension() should return an integer representing the number of points a student receives for properly submitting a file in Java.
        // If a student’s submitted file ends in .java, they get 1 point. If a student’s submitted file doesn’t end in .java, they get 0 points.
        // If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points.
        // What kind of exception is up to you, including to a custom exception!
        // In Main(), Professor Jackson has provided a hashmap of students and the names of their submitted files for you to test out your work.
        // If an exception is caught, make sure to print out the error message.

        int grade = 0;

             if (fileName == null  || fileName.isEmpty() ) {
                 try {
                     throw new RuntimeException("name cannot be blank");
                 } catch (RuntimeException e) {
                     e.printStackTrace();
                 }
                grade--;
             } else if (fileName.contains(".java")) {
                 grade++;
             }

        return grade;
    }

}
