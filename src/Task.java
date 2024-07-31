public abstract class Task {
    private String title;
    private String priority;
    private String description;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public Task(String title, String priority, String description, boolean status) {
        this.title = title;
        this.priority = priority;
        this.description = description;
        this.status = status;
        taskCounter++;
    }

    private static int taskCounter=0;

    public static int getTaskCounter() {
        return taskCounter;
    }

    public static void setTaskCounter(int taskCounter) {
        Task.taskCounter = taskCounter;
    }

    public Task(String title, String priority, String description) {
        this.title = title;
        this.priority = priority;
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static int getTaskCount(){
        return taskCounter;
    }

    public void setStatus(boolean stat){
        status= stat;
    }
}
