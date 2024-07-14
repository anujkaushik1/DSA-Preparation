package OOPS.Inheritance;

public class Users {

    private String userName;
    private String email;

    public Users(String userName, String email){
        this.userName = userName;
        this.email = email;
    }

    public void login(){
        System.out.println("User logged in: " + userName + "  " + email);
    }
}
