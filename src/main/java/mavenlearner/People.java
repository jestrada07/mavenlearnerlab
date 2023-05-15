package mavenlearner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
private List<Person> personList;

    public People(){

        personList = new ArrayList<>();

    }


        public void add(Person person){
        this.personList.add(person);


        }

        public String findById(long id) { // finds a person by the id - returns the name of person.

            for (Person person : personList) {
                if (person.getId()==id) {

                    return person.getName();

                }


            }

            return "this person you're trying to find doesn't exist";
        }




        public boolean hasEntry(Person person){
            if(personList.contains(person)){

                return true;
            }
            return false;
        }

        public boolean contains(Person person){
        if(personList.contains(person)){

            return true;
        }
            return false;
        }


        public void remove(Person person){
        this.personList.remove(person);



        }

        public void remove(long id){
        this.personList.remove(id);

        }


        public void removeAll(){
        this.personList.clear();


        }


        public int count(){

        return personList.size();

        }

    public Person[] toArray(){

        return personList.toArray(new Person[personList.size()]);  // to Array - Returns an array containing all the elements in this list in proper sequence (from first to last element);


    }




    @Override
    public Iterator<Person> iterator() {

        return personList.iterator();
    }
}
