public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFirstName("Ali");
        student1.setLastName("Cayli");
        student1.setId(1);
        student1.setEmail("****@gmail.com");
        student1.setAge(20);
        student1.setGender("Erkek");

        Student student2 = new Student();
        student2.setFirstName("Ahmet");
        student2.setLastName("Uyan");
        student2.setId(2);
        student2.setEmail("*****@gmail.com");
        student2.setAge(25);
        student2.setGender("Erkek");


        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setId(4);
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setGender("Erkek");
        instructor.setLessonGiven("Yazilim Gelistirici Kampi (Java + React)");
        instructor.setNumberofStudents(5000);

        Student[] students=new Student[]{student1,student2};
        for(Student student:students){
            System.out.println("Ogrencinin adi :"+ student.firstName);
            System.out.println("Ogrencinin soyadi :"+student.lastName);
        }

        System.out.println("Egitmenin adi :"+instructor.firstName);
        System.out.println("Egitmenin soyadi :"+instructor.lastName);


        UserManager userManager1 = new UserManager();

        userManager1.add(student1);
        userManager1.delete(student1);

        userManager1.add(student2);
        userManager1.delete(student2);

        UserManager userManager2 = new UserManager();

        userManager2.add(instructor);
        userManager2.delete(instructor);



    }


}


