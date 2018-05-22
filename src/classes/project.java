package classes;

import classes.task;

public class project {

    //class variables
    private String projectName;
    private long projectID;
    private task taskArray[];
    private int taskCount;

    //Object variables
    private int TaskNum;


    //class methods
    public int getTaskIndex(long taskID) {
        // returns index number in array using database task id
        int iReturn;
        iReturn = 0;
        for (int i=0;i==taskCount;i++) {
            if (taskArray[i].getTaskID() == taskID) {
                iReturn = i;
            }
        }
        return iReturn;
    }

    public void addTask(String taskName, long taskID, long parentTaskID, long previousTaskID, int orderNumber) {
    //adds task to project instance, increases task count
    }

    public void removeTask(int taskIndex) {
    //removes task from project instance , decreased task count
    }

    //getter and setter
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getProjectID() {
        return projectID;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    public int getTaskCount() {
        return taskCount;
    }

}