import java.util.Scanner;

public class validcredential_duringlogin {
    public static void main(String[] args) {
        String _username="himika";
        String _password= "1234";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username=input.next();
        System.out.println("Enter your password");
        String password = input.next();
        if(username.equals(_username) && password.equals(_password)){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }

    }
}
