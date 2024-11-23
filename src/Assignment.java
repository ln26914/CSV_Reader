import java.util.Scanner;
import java.io.*;

public class Assignment {
    
    // Data Members
    String assignment_name;
    String canvas_class;
    Date due_date;
    double grade_weight;
    double class_points;
    boolean completion;

    // Constructors
    // Constructor for Assignment
    public Assignment(String assignment_name, String canvas_class, Date due_date, double grade_weight, double class_points, boolean completion) {
        this.assignment_name = assignment_name;
        this.canvas_class = canvas_class;
        this.due_date = due_date;
        this.grade_weight = grade_weight;
        this.class_points = class_points;
        this.completion = completion;
    }
    // Default Constructor
    public Assignment() {
        this.assignment_name = "No Name";
        this.canvas_class = "No Class";
        this.due_date = "No Due Date";
        this.grade_weight = 0.0;
        this.class_points = 0.0;
        this.completion = false;
    }

    //toBigString()
    //Returns a string with annotated values.
    public String toBigString() {
        // Add course name and assignment name to string
        String outputString = String.format("%32s | %32s \n", this.canvas_class, this.assignment_name);
        
        // Due Date
        // Date Logic Unknown

        //Grade Weight and Points
        outputString += String.format("Grade Weight: %3.0f %% \n", this.grade_weight * 100); // Show Category Weight as a percent
        outputString += String.format("Assignment Points: %d \n", this.points);

        // Completion?
        outputString += String.format("Completed? %b", this.completion)

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
        return this.assignment_name;
    }
    public String getCourse() {
        return this.canvas_class;
    }
    public Date getDueDate() {
        return this.due_date;
    }
    public double getWeight() {
        return this.grade_weight;
    }
    public int getPoints() {
        return this.class_points;
    }
    public boolean isCompleted() {
        return this.completion;
    }

    //Setter Functions
    public void setName(String newName) {
        this.assignment_name = newName;
    }
    public void setCourse(String newClass) {
        this.canvas_class = newClass;
    }
    public void setDueDate(Date newDate) {
        this.due_date = newDate;
    }
    public void setWeight(double newWeight) {
        this.grade_weight = newWeight;
    }
    public void setPoints(int newPoints) {
        this.class_points = newPoints;
    }
    public void setCompletion(boolean newState) {
        this.completion = newState;
    }

}