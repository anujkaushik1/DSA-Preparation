package OOPS.Inheritance;

public class RegularUser extends Users{
    public RegularUser(String userName, String email) {
        super(userName, email);
    }

    public void browseProducts(){
        System.out.println("Seller adding products");
    }

    public static void main(String[] args) {
        RegularUser ru = new RegularUser("Anuj", "a@gmail.com");
    }
}
