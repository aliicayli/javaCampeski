public class Instructor extends User {
    private int id;
    private String email;
    private String lessonGiven;
    private int numberofStudents;

    public Instructor() {

    }

    public Instructor(int id, String email, String lessonGiven, int numberofStudents){
        this.id=id;
        this.email=email;
        this.lessonGiven=lessonGiven;
        this.numberofStudents=numberofStudents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLessonGiven() {
        return lessonGiven;
    }

    public void setLessonGiven(String lessonGiven) {
        this.lessonGiven = lessonGiven;
    }

    public int getNumberofStudents() {
        return numberofStudents;
    }

    public void setNumberofStudents(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }
}
