import mavenlearner.People;
import mavenlearner.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {



@Test
public void testAdd(){
    People people = new People();



    Person person = new Person(12112, "Jaimi Estrada");

    people.add(person);


    Assert.assertEquals(1,people.count());

    Assert.assertTrue(people.hasEntry(person));





}

    @Test
   public void testRemove(){
    People people = new People();


    Person person = new Person(2323, "Mike Jones");

    people.add(person);

    people.remove(person);


    Assert.assertEquals(0, people.count());

    Assert.assertFalse(people.hasEntry(person));





    }

    @Test
    public void testFindById(){
    People people = new People();
    Person person = new Person(2323, "Johnny");

    people.add(person);



    people.findById(person.getId());

    Assert.assertEquals(person.getId(), 2323);



    }











}
