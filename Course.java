
public class Course {
    private String str;

    public Course(String str) {
        this.str=str;
    }
    public String getName () {
        return str;
    }

    @Override
    public String toString() {
       return String.format("Course: %s", str);
    }
}
