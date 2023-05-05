import mavenlearner.Instructor;
import mavenlearner.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {


    @Test
    public void test(){

       Instructors instructors =  Instructors.getInstance();
        Instructor instructor = new Instructor(123, "Bobby");
        Instructor instructor2 = new Instructor(342, "Namor");

        instructors.add(instructor);
        instructors.add(instructor2);

        Assert.assertTrue(instructors.hasEntry(instructor));
        Assert.assertTrue(instructors.hasEntry(instructor2));



    }





}
