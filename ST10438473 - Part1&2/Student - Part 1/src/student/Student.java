
package student;
public class Student {
    public static void main(String[] args) {
        StudentManagementApp app = new StudentManagementApp();
        app.run();
    }



 private final String id;
    private final String name;
    private final int age;
    private final String email;
    private final String course;

    public Student(String id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "STUDENT ID: " + id + 
               "\nSTUDENT Name: " + name + 
               "\nSTUDENT Age: " + age + 
               "\nSTUDENT Email: " + email + 
               "\nSTUDENT Course: " + course;
    }
}    
  
        
 