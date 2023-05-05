package mavenlearner;

import java.util.ArrayList;
import java.util.List;
//Creating a singleton class rules - creating a static instance - create private constructor - create static method to get instance - returns instance.

public final class Instructors extends People {
   //static instance variable
   private static final Instructors instance = new Instructors();
    private List<Instructor> instructorsList;


    private Instructors(){
     instructorsList = new ArrayList<>();

     Instructor instructor = new Instructor(1, "Harry Potter");
     Instructor instructor2 = new Instructor(2, "Albus Dumbledore");
     Instructor instructor3 = new Instructor(3, "Severus Snape");
     Instructor instructor4 = new Instructor(4, "Rubius Hagrid");

     instructorsList.add(instructor);
     instructorsList.add(instructor2);
     instructorsList.add(instructor3);
     instructorsList.add(instructor4);






    }


    public static Instructors getInstance(){

     return instance;


    }









}
