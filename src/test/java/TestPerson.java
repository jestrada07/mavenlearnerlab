import mavenlearner.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
      //given
        Person person = new Person(2233, "Bobby jones");

        //when
        long expectedId = person.getId();
        String expectedName = person.getName();

        //then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());


    }

    @Test
    public void testSetName(){
    //given

      Person person = new Person(2456, "Abel Tesfaye");
      String name = person.getName();


      //when
       person.setName("Ralph Boner");
      String expectedName = person.getName();


         //then
        Assert.assertEquals(expectedName ,person.getName());








    }








    }



