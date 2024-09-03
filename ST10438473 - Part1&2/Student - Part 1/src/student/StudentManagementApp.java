package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApp {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Student Management App");
        System.out.println("***************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        System.out.println("Please Select One Of The Following Menu Items");
        System.out.println("1. Capture a New Student");
        System.out.println("2. Search for a Student");
        System.out.println("3. Delete a Students");
        System.out.println("4. Print a Students Report");
        System.out.println("5. Exit Apllication");
    }

    public String captureStudent(String id, String name, int age, String email, String course) {
        Student student = new Student(id,name,age,email,course);
        students.add(student);
        return ("Student details have been successfully saved.");
    }

    public String searchStudent(String id) {
        String output = "";
        Student student = findStudentById(id);
        if (student != null) {
            output = ("Student Found: " + student);
        } else {
            output = ("Student not found.");
        }
        return output;
    }

    public String deleteStudent(String id) {
        String output = "";
        Student student = findStudentById(id);
        if (student != null) {
            students.remove(student);
            output = ("Student has been successfully deleted.");
        } else {
            output = ("Student not found.");
        }
        return output;
    }

    public String viewStudentReport() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Student Report:");
        for (Student student : students) {
            sb.append(student.toString()+ "\n");
        }
        return sb.toString();
    }

    private Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Capture A New Student");
                    System.out.println("**************************");
                    System.out.println("Enter a Students ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter a Students Name: ");
                    String name = scanner.nextLine();
                    int age = 0;
                    do {
                        System.out.println("Enter a Students Age (must be 16 or older): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("You have entered a incorrect student age!!!.");
                            scanner.next();
                        }
                        age = scanner.nextInt();
                        scanner.nextLine();
                    } while (age < 16);

                    System.out.println("Enter the Student Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Enter Student Course: ");
                    String course = scanner.nextLine();
                    System.out.println(captureStudent(id,name,age,email,course));
                    break;
                case 2:
                    System.out.println("Enter Student ID to search: ");
                    System.out.println("--------------------------------");
                    String sId = scanner.nextLine();

                    System.out.println(searchStudent(sId));
                    break;
                case 3:

                    System.out.println("Enter Student ID to delete: ");
                    String sID = scanner.nextLine();
                    System.out.println(deleteStudent(sID));
                    break;
                case 4:
                    System.out.println(viewStudentReport());
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
