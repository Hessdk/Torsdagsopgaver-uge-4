import java.util.ArrayList;
public class Student {

    private String name;
    private ArrayList<Course> whichCourse;

    public Student(String name) {
        this.name = name;
        this.whichCourse = new ArrayList<>();
    }
    public void addCourse(Course course) {
        whichCourse.add(course);
    }

    public ArrayList<Course> getCourses() {
        return whichCourse;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("The name of the student: %s, Student courses are: %s", name, whichCourse);

    }

}
