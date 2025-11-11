import java.time.LocalDate;

public class Student {
    private int id;
    private String firstName;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String contact;
    private  String group;
    private Tutor tutor;

    public Student(int id , String firstName , String name , LocalDate birthDate , String email , String contact , String group) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.contact = contact;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
