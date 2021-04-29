public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" "+" Sisteme kayit yapti");
    }

    public void delete(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" "+" Sistemden kaydini sildi ");
    }
}
