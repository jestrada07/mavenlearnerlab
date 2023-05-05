package mavenlearner;

import java.util.ArrayList;
import java.util.List;
//Creating a singleton class rules - creating a static instance - create private constructor - create static method to get instance - returns instance.
//singleton class - non-extendable and final
public final class Students extends People {
    //instance variable - final
    private static final Students instance = new Students();
    private List<Student> studentList;


    private Students() {
        studentList = new ArrayList<>();
        Student student = new Student(1,"Jaimi Estrada");
        Student student2 = new Student(2, "Bob Evans");
        Student student3 = new Student(3, "Lucia Williams");
        Student student4 = new Student(4, "Bobby Gomez");

        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);






    }



        public static Students getInstance() {
            return instance;
        }


    }


