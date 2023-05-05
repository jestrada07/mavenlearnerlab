import mavenlearner.Instructor;
import mavenlearner.Person;
import mavenlearner.Student;
import mavenlearner.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(45343, "Mikaila");

        Assert.assertTrue(instructor instanceof Teacher);





    }

    @Test
    public void testInheritance(){
      Instructor instructor = new Instructor(3234, "Johnny");

      Assert.assertTrue(instructor instanceof Person);



    }

    @Test
    public void testTeach(){
    Instructor instructor = new Instructor(3234, "Johnny");
    Student student = new Student(2323, "Bobby");


    instructor.teach(student, 10.0);

    Assert.assertEquals(10, student.getTotalStudyTime(), 0.0 ); //delta value specifies the maximum difference allowed between two values. In this case, a delta value of 0.0 is used, indicating that the two values must be exactly equal.


    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(3234, "Johnny");
        Student student1 = new Student(1232, "Jaimi");
        Student student2 = new Student(1232, "Harry");
        Student student3 = new Student(1232, "James");
        Student[] learners = {student1,student2,student3};

        double numberOfHours = 5.0;
        //when
        instructor.lecture(learners, numberOfHours);

        //then
        double totalStudyTime = numberOfHours / learners.length;

        for(Student student: learners ){

            Assert.assertEquals(totalStudyTime,student.getTotalStudyTime(),0.0);

        }










    }



}
