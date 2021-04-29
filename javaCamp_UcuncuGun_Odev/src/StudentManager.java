public class StudentManager extends UserManager {
    public void add(Student student) {
        System.out.println(student.getFirstName() + " Eklendi");
    }

    public void delete(Student student) {
        System.out.println(student.getFirstName() + " Silindi");
    }

    public void update(Student student) {
        System.out.println(student.getFirstName() + " Guncellendi");
    }
}
