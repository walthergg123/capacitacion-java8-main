package expresionesLambda;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private String birthday;
    private Sex gender;
    private String emailAddress;


    public Person(String name, String birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday='").append(birthday).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", emailAddress='").append(emailAddress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
