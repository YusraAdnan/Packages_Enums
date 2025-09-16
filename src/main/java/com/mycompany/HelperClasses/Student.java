package com.mycompany.HelperClasses;

public class Student {
    
    private String name;
    
    //initializing the enum
    private YearLevel year;

    public Student(String name, YearLevel year)
    {
        this.name = name;
        this.year = year;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }

    public YearLevel getYear() 
    {
        return year;
    }
    
    public void setYear(String newYear)
    {
        name = newYear;
    }
    
    public void displayInfo() 
    {
        if(year == YearLevel.FIRST_YEAR)
        {
           System.out.println("Student: " + name + " enrolled in: 1st Year");
        }
        else if(year == YearLevel.SECOND_YEAR)
        {
            System.out.println("Student: " + name + " enrolled in: 2nd Year");
        }
        else
        {
            System.out.println("Student: " + name + " enrolled in: 3rd Year");
        }
        
    }
}
