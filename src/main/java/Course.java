import java.time.Instant;
import java.util.List;

public class Course {
    private int id;
    private String label;
    private int credit;
    private Teacher teacher;
    private List<Exam> exams;

    public Course(int id , String label, int credit , Teacher teacher , List<Exam> exams) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
        this.exams = exams;
    }

    public String getLabel() {
        return label;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public int getCredit() {
        return credit;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public double getCourseGrade(Student student, Instant t ) {
        double weightedSum = 0;
        double coeffSum = 0;

        for (Exam exam : exams) {
            double grade = exam.getExamGrade(student, t);
            weightedSum += grade * exam.getCoefficient();
            coeffSum += exam.getCoefficient();
        }

        return coeffSum > 0 ? weightedSum / coeffSum : 0.0;
    }
}
