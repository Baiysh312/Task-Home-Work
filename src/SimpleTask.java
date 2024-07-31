public class SimpleTask extends Task{

    public SimpleTask(String title, String priority, String description, boolean status) {
        super(title, priority, description,status);
    }
    @Override
    public String toString() {
        return "Task{" +
                "title='" + getTitle() + '\'' +
                ", priority='" + getPriority() + '\'' +
                ", description='" + getDescription() + '\'' +
                '}';
    }

}
