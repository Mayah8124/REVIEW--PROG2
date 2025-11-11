import java.time.LocalDateTime;

public class Exam {
    private int id;
    private String title;
    private Course course;
    private LocalDateTime dateTime;
    private int coefficient;

    public Exam(int id , String title, Course course, LocalDateTime dateTime, int coefficient) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.dateTime = dateTime;
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
