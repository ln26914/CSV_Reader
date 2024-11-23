import java.util.Scanner;
import java.io.*;

public class Assignment {
    
    // Data Members
    private String name;
    private String course;
    private String category;

    private int points; // Maximum points per assignment
    private double categoryWeight; // Value between 0 and 1

    // Constructors
    // Constructor for Assignment
    public Assignment(String name, String course, String category, double categoryWeight, int points) {
        this.name = name;
        this.course = course;
        this.category = category;
        this.categoryWeight = categoryWeight;
        this.points = points;
    }
    // Default Constructor
    public Assignment() {
        this.name = "No Name";
        this.course = "No Course";
        this.category = "No Category";
        this.categoryWeight = 0.0;
        this.points = 0;
    }

    //toBigString()
    //Returns a string with annotated values.
    public String toBigString() {
        // Add course name and assignment name to string
        String outputString = String.format("%32s | %32s \n", this.course, this.name);
        
        // Add Category, CategoryWeight and points
        outputString += String.format("Category: %32s \n", this.category);
        outputString += String.format("Category Weight: %3.0f %% \n", this.categoryWeight * 100); // Show Category Weight as a percent
        outputString += String.format("Assignment Points: %d \n", this.points);

        return outputString
    }
    //toString
    public String toString() {
        String outputString = String.format("%32s,%32s,", this.name, this.getCourse);
        
        // Add Category, CategoryWeight and points
        outputString += String.format("%32s,", this.category);
        outputString += String.format("%3.3f,", this.categoryWeight); // Show Category Weight as a percent
        outputString += String.format("%d", this.points);
    }

    //Getter Functions
    public String getName() {
        return this.name;
    }
    public String getCourse() {
        return this.course;
    }
    public String getCategory() {
        return this.category;
    }
    public double getWeight() {
        return this.categoryWeight;
    }
    public int getPoints() {
        return this.points;
    }

    //Setter Functions
    public void setName(String newName) {
        this.name = newName;
    }
    public String setCourse(String newCourse) {
        this.course = newCourse;
    }
    public String setCategory(String newCategory) {
        this.category = newCategory;
    }
    public double setWeight(double newWeight) {
        this.categoryWeight = newWeight;
    }
    public int setPoints(int newPoints) {
        this.points = newPoints;
    }

}