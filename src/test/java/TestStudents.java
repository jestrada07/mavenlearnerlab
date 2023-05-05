import mavenlearner.Student;
import mavenlearner.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents{

    @Test
    public void test(){


       Students students = Students.getInstance();

       Student student = new Student(1232, "Jaimi");
       Student student1 = new Student(232, "Peter");

       students.add(student);
       students.add(student1);

       Assert.assertTrue(students.hasEntry(student));
       Assert.assertTrue(students.hasEntry(student1));



    }







}
