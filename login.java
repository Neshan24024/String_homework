import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String existUsername = "";
        String existPassword = "";

        System.out.println("Sign-up:");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (existUsername.equals("")) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (password.length() > 8 && password.contains("@")) {
                existUsername = username;
                existPassword = password;
                System.out.println("Sign-up successful!");
            } else {
                System.out.println("Password must be at least 8 characters long and contain '@'.");
            }
        } else {
            System.out.println("Username already exists. Please choose a different one.");
        }

        // Login
        System.out.println("\nLogin:");
        System.out.print("Enter your username: ");
        String loginUser = scanner.nextLine();
        System.out.print("Enter your password: ");
        String loginPass = scanner.nextLine();

        if (loginUser.equals(existUsername) && loginPass.equals(existPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Check your username and password.");
        }

    }
}
