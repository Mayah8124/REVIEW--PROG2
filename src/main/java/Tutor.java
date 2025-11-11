import java.time.LocalDate;

public class Tutor {
    private int id;
    private String name;
    private int age;
    private LocalDate birthday;
    private String email;
    private String contact;
    private String studentLink;

    public Tutor(int id , String name, int age, LocalDate birthday, String email, String contact, String studentLink) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.contact = contact;
        this.studentLink = studentLink;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStudentLink() {
        return studentLink;
    }
}
