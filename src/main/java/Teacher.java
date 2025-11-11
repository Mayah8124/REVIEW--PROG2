import java.time.LocalDate;

public class Teacher {
    private int id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String contact;
    private String speciality;

    public Teacher(int id , String name, String lastName, LocalDate birthDate, String email, String contact, String speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.contact = contact;
        this.speciality = speciality;
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

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }
}
