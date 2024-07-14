package OOPS.Inheritance;

public class Admin extends Users{

    public Admin(String userName, String email) {
        super(userName, email);
    }

    public void manageProducts(){
        System.out.println("Admin managing products");
    }


    public static void main(String[] args) {
        Admin ad = new Admin("Anuj", "anuj@gmail.com");
        ad.login();
        ad.manageProducts();
    }
}
