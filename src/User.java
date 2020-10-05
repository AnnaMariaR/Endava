import java.sql.Timestamp;

public class User {

    private String name;
    private String lastname;
    private Integer age;
    private String email;
    private String status;
    private Timestamp timestamp;

    /**
     * Constructor
     *
     * @param name String
     * @param lastname String
     * @param age Int
     * @param email String
     * @param status String
     * @param timestamp Timestamp
     */
    public User(String name, String lastname, int age, String email, String status, Timestamp timestamp) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * toString method that returns all data about an user
     * @return String
     */
    public String toString() {
        return "Data about User: {" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", timestamp=" + timestamp +
                '}' + "\n" ;
    }
}