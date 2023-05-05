package mavenlearner;

public class ZipCodeWilmington {
    //Creating a singleton class rules - creating a static instance - create private constructor - create static method to get instance - returns instance.
    private static final ZipCodeWilmington instance = new ZipCodeWilmington();
    private final Instructors instructors;
    private final Students students;

    private ZipCodeWilmington() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();
    }















    public static ZipCodeWilmington getInstance() {
        return instance;


    }


}