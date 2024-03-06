package TaskPackage;
import TaskPackage.Task;
import UserPackage.User;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task {
    public String name;
    public double start_time;
    public double finish_time;

    public Task(String name) {
        this.name = name;
    }
    public double getDuration() {
        return finish_time - start_time;
    }
}
