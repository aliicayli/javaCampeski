public class User {
    public String firstName;
    public String lastName;
    public String gender;

    public User(){

    }

    public User(String firstName,String lastName,String gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
