package mavenlearner;

public class Student extends Person implements Learner {
    private double totalStudyTime; //instance variable



    public Student(long id, String name) {

        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours; //+= adds value to the variable


    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
