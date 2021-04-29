public class InstructorManager extends UserManager{
    public void add(Instructor instructor){
        System.out.println(instructor.getFirstName()+" Eklendi");
    }

    public void delete(Instructor instructor){
        System.out.println(instructor.getFirstName()+" Silindi");
    }

    public void update(Instructor instructor){
        System.out.println(instructor.getFirstName()+" Guncellendi");
    }
}
