import mavenlearner.Learner;
import mavenlearner.Person;
import mavenlearner.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testImplementation(){
      //given
      Student student = new Student(2343, "Mike Jones");

        Assert.assertTrue(student instanceof Learner);  //this checks if student is a learner - instance of learner - returns true







    }

    @Test
    public void testInheritance(){
        Student student = new Student(23435, "Abel Testfaye");



        Assert.assertTrue(student instanceof Person); //checks if student is a person - returns true




    }

    @Test
    public void testLearn(){

    Student student = new Student(3342, "Alfonza Jones");

    student.learn(student.getTotalStudyTime());

    //this method increments total study time by number of hours - gettotalstudytimee method returns what is incremented.

    }



}
