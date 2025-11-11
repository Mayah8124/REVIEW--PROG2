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
}
