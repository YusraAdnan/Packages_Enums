package com.mycompany.enums_packages;

import com.mycompany.HelperClasses.Student;
import com.mycompany.HelperClasses.YearLevel;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) 
    {
         /**
         * === Activity Instructions === 
         * 1. Create a package called com.company.HelperClasses
         
         * 2. Inside this package, create two files:
         *    - An enum called YearLevel with values FIRST_YEAR, SECOND_YEAR, THIRD_YEAR.
         *    - A class called Student with fields:
         *         String name
         *         YearLevel using enum
         *         displayInfo() method.
         *
         * 3. In displayInfo():
         *     use the enums demo to example to print out student details like this for each year:
         *     "Student: Aisha enrolled in: 1st Year"

         *
         * 4. - Create an ArrayList of Student in the main
         *    - Add at least 3 Student objects, each with a different YearLevel.
         *    - Use the ArrayList example we did to see how we can add an object to an array list
         *    - Use the ArrayList example to also see how we can print out objects in array lists
         *
         * 5. Run your program. The output should list each student’s name
         *    with their correct year (1st, 2nd, or 3rd Year).
         *
         */

        ArrayList<Student> students = new ArrayList<>();
         
        // Add some students
        students.add(new Student("Aisha", YearLevel.FIRST_YEAR));
        students.add(new Student("Peter", YearLevel.FIRST_YEAR));
        students.add(new Student("Zondi", YearLevel.THIRD_YEAR));
        students.add(new Student("Karim", YearLevel.SECOND_YEAR));
        students.add(new Student("Thandi", YearLevel.THIRD_YEAR));

        System.out.println("=== Student List ===");
        for (Student s : students) 
        {
            s.displayInfo();
        }
        
        int countFirstYears = 0;
        for(Student s: students)
        {
            if(s.getYear() == YearLevel.FIRST_YEAR)
            {
                countFirstYears++;
            }
        }
        System.out.println("\nNumber of First Years: " + countFirstYears);
    }
}
