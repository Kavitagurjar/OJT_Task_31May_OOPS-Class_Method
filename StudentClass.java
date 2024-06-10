// Define the Student class
class Student {
    // Attributes (fields)
    String name;
    int rollNumber;
    double marks;

    // Constructor to initialize the attributes
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the roll number
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Method to get the roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Method to set the marks
    public void setMarks(double marks) {
        if (marks >= 0) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be non-negative.");
        }
    }

    // Method to get the marks
    public double getMarks() {
        return marks;
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Main class to demonstrate the usage of the Student class
public class StudentClass {
    public static void main(String[] args) {
        // Create a Student object using the constructor
        Student student1 = new Student("Deeksha", 101, 89.5);

        // Display the initial details
        System.out.println("Initial details:");
        student1.displayDetails();

        // Modify the student's attributes using setter methods
        student1.setName("Kavita");
        student1.setRollNumber(101);
        student1.setMarks(82.3);

        // Display the updated details
        System.out.println("\nUpdated details:");
        student1.displayDetails();

        // Get the attributes using getter methods
        String name = student1.getName();
        int rollNumber = student1.getRollNumber();
        double marks = student1.getMarks();

        System.out.println("\nRetrieved details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}
