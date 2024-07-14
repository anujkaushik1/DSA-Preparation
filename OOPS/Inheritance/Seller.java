package OOPS.Inheritance;

public class Seller extends Users{
    public Seller(String userName, String email) {
        super(userName, email);
    }

    public void addProducts(){
        System.out.println("Seller adding products");
    }

    public static void main(String[] args) {
        Seller s = new Seller("Anuj", "a@gmail.com");

    }
}
