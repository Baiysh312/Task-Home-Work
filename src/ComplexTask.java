public class ComplexTask extends Task {
    private Task[] subTasks = new SimpleTask[10];

    public Task[] getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(Task[] subTasks) {
        this.subTasks = subTasks;
    }

    public ComplexTask(String title, String priority, String description, boolean status) {
        super(title, priority, description, status);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + getTitle() + '\'' +
                ", priority='" + getPriority() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }

    private int counterArray = 0;

    public void addTasks(Task task) {
        subTasks[counterArray] = task;
        counterArray++;
    }

    public void tasksTrue() {
        for (Task task1 : subTasks) {
            if (task1 != null) {
                task1.setStatus(true);
            }
        }
    }
}
