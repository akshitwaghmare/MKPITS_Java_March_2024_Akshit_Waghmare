package TaskManagementSystem;

import java.util.Date;

public class Task {
    private int taskId;
    private String taskName;
    private int priority;
    private int dueDate;

    public Task(int taskId, String taskName, int priority, int dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public int getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return  "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                '}';
    }
}
