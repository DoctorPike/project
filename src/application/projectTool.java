package application;
import classes.task;
import classes.project;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class projectTool{

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
    task NewTask;
    String strInput;
    String taskName;
    int taskID;
        NewTask = new task("New Task",1);
        System.out.println("Hello User");
        do {
            System.out.println("Pleae enter your commands ('task','list','exit')");
            strInput = scanner.nextLine();
            System.out.println("you typed: " + strInput);
            if (strInput.equals("task")) {
                System.out.println("Enter task name");
                taskName = scanner.nextLine();
                NewTask.setTaskName(taskName);
                System.out.println("Enter task id");
                taskID = scanner.nextInt();
                scanner.nextLine(); // because nextLine is skipped after integer input ...???t
                NewTask.setTaskID(taskID);
                System.out.println("Task '"+NewTask.getTaskName()+"' with ID " + NewTask.getTaskID() + " has been created.");
            }
            if (strInput.equals("list")) {
                System.out.println("task name:" + NewTask.getTaskName());
                System.out.println("task ID:" + NewTask.getTaskID());
            }
        } while (!strInput.equals("exit"));
        System.out.println("program terminated!");
    }

}
