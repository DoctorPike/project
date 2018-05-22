package classes;
import java.util.ArrayList;
public class task {
    //object variables

    private long taskID;
    private String taskName;
    private long parentTaskID;
    private long previousTaskID;
    private int OrderValue;

    public int getOrderValue() {
        return OrderValue;
    }

    public void setOrderValue(int orderValue) {
        OrderValue = orderValue;
    }

    //constructor
    public task(String taskName, long taskID) {
        this.taskName = taskName;
        this.taskID = taskID;
    }


    // class methods

    public void AddTask() {
    }

    //getter and setter

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public long getParentTaskID() {
        return parentTaskID;
    }

    public void setParentTaskID(long parentTaskID) {
        this.parentTaskID = parentTaskID;
    }

    public long getPreviousTaskID() {
        return previousTaskID;
    }

    public void setPreviousTaskID(long previousTaskID) {
        this.previousTaskID = previousTaskID;
    }


}
