
package student;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentManagementAppTest {
    StudentManagementApp app = new StudentManagementApp();
    public StudentManagementAppTest() {
    }

    

    @Test
    public void testCaptureStudent() {
        assertEquals("Student details have been successfully saved.",app.captureStudent("101", "Wesley", 18, "Wesley@gmail.com", "BCAD"));
    }

    @Test
    public void testSearchStudent() {
       app.captureStudent("101", "Wesley", 18, "Wesley@gmail.com", "BCAD"); 
       assertEquals("Student Found: STUDENT ID: 101\n" +
                    "STUDENT Name: Wesley\n" +
                    "STUDENT Age: 18\n" +
                    "STUDENT Email: Wesley@gmail.com\n" +
                    "STUDENT Course: BCAD",app.searchStudent("101"));
    }
    
    @Test
    public void testnotFoundSearchStudent() {
       app.captureStudent("101", "Wesley", 18, "Wesley@gmail.com", "BCAD"); 
       assertEquals("Student not found.",app.searchStudent("102"));
    }

    @Test
    public void testDeleteStudent() {
        app.captureStudent("101", "Wesley", 18, "Wesley@gmail.com", "BCAD");
        assertEquals("Student has been successfully deleted.",app.deleteStudent("101"));
    }
    
    @Test
    public void testnotFoundDeleteStudent() {
        app.captureStudent("101", "Wesley", 18, "Wesley@gmail.com", "BCAD");
        assertEquals("Student not found.",app.deleteStudent("102"));
    }

    @Test
    public void testViewStudentReport() {
        app.captureStudent("101", "Wesley", 18, "Wesley@gmail.com", "BCAD");
        assertEquals("STUDENT ID: " + "101" + 
               "\nSTUDENT Name: " + "Wesley" + 
               "\nSTUDENT Age: " + 18 + 
               "\nSTUDENT Email: " + "Wesley@gmail.com" + 
               "\nSTUDENT Course: " + "BCAD\n",app.viewStudentReport());
    }

    
    
}
