package classes;

import classes.task;
import java.util.ArrayList;

public class project {

    //class variables
    private String projectName;
    private long projectID;
    public ArrayList<task> tasks;
    private int taskCount;

    //Object variables
    private int TaskNum;

    //constructor

    public project(long projectID, String projectName) {
        this.projectName = projectName;
        this.projectID = projectID;
        this.taskCount = -1; //to have same indexing as in arrays ... maybe to be changed
    }

    //class methods
    public int getTaskIndex(long taskID) {
        // returns index number in array using database task id
        int iReturn;
        iReturn = 0;
        for (int i=0;i==taskCount;i++) {
            if (tasks.get(i).getTaskID() == taskID) {
                iReturn = i;
            }
        }
        return iReturn;
    }

    public void addTask(String taskName, long taskID, long parentTaskID, long previousTaskID, int orderNumber) {
    //adds task to project instance, increases task count
        this.taskCount ++;
        //if it'S the first task the task array is null, so it has to be created
        if (this.taskCount == 0) {
            tasks = new ArrayList<task>();
        }

        this.tasks.add(new task(taskName,taskID));
        this.tasks.get(this.taskCount).setParentTaskID(parentTaskID);
        this.tasks.get(this.taskCount).setPreviousTaskID(previousTaskID);
        this.tasks.get(this.taskCount).setOrderValue(orderNumber);

    }

    public void removeTask(int taskIndex) {
    /*  removes task from project instance , decreased task count

        VBA Code to be rewritten:

        Dim TempTaskArray() As Task
        Dim i As Integer
        Dim NewIndex As Integer
        'store task array except removed task in temporary array
        ReDim TempTaskArray(TaskNum)
                NewIndex = -1
        'if more than 1 task then rebuild task array with remaining task
        '! 0 equals 1 task
        If TaskNum > 0 Then
        For i = 0 To TaskNum
        If i <> TaskIndex Then
        NewIndex = NewIndex + 1
        Set TempTaskArray(NewIndex) = New Task
        Set TempTaskArray(NewIndex) = TaskArray(i)
        End If
        Next i
        'store remaining array back to task array
        'change number of tasks of project
        ReDim TaskArray(NewIndex)
                For i = 0 To NewIndex
        Set TaskArray(i) = TempTaskArray(i)
        Next i
        Else
        'if it was the last task then only reset the array and set tasknum to -1
        Erase TaskArray
        TaskNum = -1
        End If
        Erase TempTaskArray
        TaskNum = NewIndex*/

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
/*

to be rewritten:
        Public Property Get tasks(i As Integer) As Task
        Set tasks = New Task
        Set tasks = TaskArray(i)
        End Property

    Public Property Get getTaskIndex(TaskID As Long) As Integer
    Dim i As Integer
    For i = 0 To TaskNum
    If TaskArray(i).ID = TaskID Then getTaskIndex = i
        Next i
        End Property

        Public Property Get Children(TaskIndex As Integer) As Integer
        Dim i As Integer
        Children = 0
        For i = 0 To TaskNum
        If TaskArray(i).ParentID = TaskArray(TaskIndex).ID Then Children = Children + 1
        Next i
        End Property


        Private Sub Class_Initialize()
        TaskNum = -1
        Erase TaskArray
        ReDim TaskArray(0)
        End Sub

        Private Sub Class_Terminate()
        TaskNum = -1
        Erase TaskArray
        ReDim TaskArray(0)
        End Sub*/
