import java.time.Instant;
import java.util.List;

public class Course {
    private int id;
    private int credit;
    private Teacher teacher;
    private enum label {
        PROG1 , PROG2 , API , POO , SYS1 , SYS2 , WEB1 , WEB2
    }

    public Course(int id , int credit , Teacher teacher) {
        this.id = id;
        this.credit = credit;
        this.teacher = teacher;
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

    public double getCourseGrade(Student student, Instant t , List<Exam> exams , List<Grade> allGrades) {
        List<Exam> examList = exams.stream()
                .filter(e -> e.getCourse().equals(this))
                .toList();

        double sum = examList.stream()
                .mapToDouble(exam -> exam.getExamGrade(student , allGrades, t) * exam.getCoefficient())
                .sum();

        double coeffSum = examList.stream()
                .mapToDouble(Exam::getCoefficient)
                .sum();

        return coeffSum == 0 ? 0 : sum / coeffSum;
    }
}
