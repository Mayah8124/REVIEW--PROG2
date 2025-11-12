import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeManagerTest {

    @Test
    public void getExamGradeTest() {
        Teacher teacher = new Teacher(
                1 , "John" , "Smith" , LocalDate.of(1999, 2, 12), "john@gmail.com" , "0331234567" , "Devops"
        );

        Course course = new Course(
                1 , 5 , teacher
        );

        Student student = new Student(
                1 , "Rose" , "Marie" , LocalDate.of(2007 , 3 , 15) , "rose@gmail.com" , "0342516798" , "K1"
        );

        LocalDateTime examDate = LocalDateTime.of(2025, 3, 3, 15, 15);

        Exam exam = new Exam(
                1 , "POO" , course , examDate , 3
        );

        Grade grade = new Grade(
                course , student , 15.0
        );

        grade.getHistory().add(new GradeHistory(14.0 , examDate.minusDays(4), "initial grade"));
        grade.getHistory().add(new GradeHistory(17.0 , examDate.minusDays(4), "retake"));

        List<Grade> allGrades = List.of(grade);

        Instant examInstant = examDate.atZone(ZoneId.systemDefault()).toInstant();

        double result = exam.getExamGrade(student , allGrades ,examInstant);

        assertEquals(17.0 , result , 0.001);
    }

    @Test
    public void getCourseGradeTest() {
        Teacher teacher = new Teacher(
                1 , "John" , "Smith" , LocalDate.of(1999, 2, 12), "john@gmail.com" , "0331234567" , "Devops"
        );

        Course course = new Course(
                1 , 5 , teacher
        );

        Student student = new Student(
                1 , "Rose" , "Marie" , LocalDate.of(2007 , 3 , 15) , "rose@gmail.com" , "0342516798" , "K1"
        );

        Exam exam = new Exam(
                1 , "POO" , course , LocalDateTime.now().minusDays(2) , 3
        );

        Exam exam2 = new Exam(
                2 , "POO" , course , LocalDateTime.now().minusDays(5) , 5
        );

        Grade grade1 = new Grade(course, student, 14.0);
        Grade grade2 = new Grade(course, student, 18.0);

        List<Exam> exams = List.of(exam, exam2);
        List<Grade> grades = List.of(grade1, grade2);

        Instant now = Instant.now();

        double courseGrade = course.getCourseGrade(student , now , exams , grades);

        assertEquals(18.5 , courseGrade , 0.001);
    }
}
