package application;
import classes.task;
import classes.project;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.awt.*;
import java.util.Scanner;

public class projectTool{

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {
    task activeTask;
    project activeProject;

    String strInput;
    String taskName;
    String projectName;
    int iTaskCount;
    long taskID;
        activeTask = new task("New Task",1);
        activeProject = new project(1,"new project");

        System.out.println("Hello User");
        do {
            System.out.println("Pleae enter your commands ('project','add task','remove task','list','exit')");
            strInput = scanner.nextLine();

            if (strInput.equals("add task")) {
                System.out.println("enter name of new task: ");
                taskName = scanner.nextLine();
                System.out.println("enter task ID");
                taskID = scanner.nextLong();
                scanner.nextLine(); // because nextLine is skipped after integer input ...???t
                activeProject.addTask(taskName, taskID, 0,0,1);
            }
            else if (strInput.equals("project")) {
                System.out.println("Enter new project name: ");
                projectName = scanner.nextLine();
                activeProject.setProjectName(projectName);
                System.out.println("Project with ID '"+ activeProject.getProjectID() + " name changed to " + activeProject.getProjectName());
            }
            else if (strInput.equals("list")) {
                iTaskCount = activeProject.getTaskCount() +1;
                System.out.println("Project : " + activeProject.getProjectName() + ", " + iTaskCount + " tasks:");
                for (int i =0; i<= activeProject.getTaskCount(); i++) {
                    if (activeProject.getTaskCount() > -1) {
                        System.out.println("taskName: " + activeProject.tasks.get(i).getTaskName() + ", taskID: " + activeProject.tasks.get(i).getTaskID());
                    }
                }
                } else {
                System.out.println("I don't know that command...");
            }
        } while (!strInput.equals("exit"));
        System.out.println("program terminated!");
    }

}
