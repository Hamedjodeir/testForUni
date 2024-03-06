package UserPackage;
import TaskPackage.Task;
import UserPackage.User;

import java.text.DecimalFormat;
import java.util.Scanner;


public class User {
    private String username;
    private String password;

    public String first_name;
    public String last_name;
    public String email;
    public int streak;

    public User(String username, String password, String first_name, String last_name, String email) {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Task createTask() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter task name: ");
        String taskName = myObj.nextLine();  // Read user input
        Task t1 = new Task(taskName);
        return t1;
    }
    public String getFullName() {
        String fullName = first_name + last_name;
        return fullName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}