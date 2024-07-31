public class Main {
    public static void main(String[] args) {
        SimpleTask simpleTask = new SimpleTask("tema", "prioritet", "opisanie", false);
        SimpleTask simpleTask1 = new SimpleTask("tema", "prioritet", "opisanie", false);
        SimpleTask simpleTask2 = new SimpleTask("tema", "prioritet", "opisanie", false);

        ComplexTask complexTask = new ComplexTask("Obshee", "proiritety", "opisanie obshei temy", false);

        complexTask.addTasks(simpleTask);
        complexTask.addTasks(simpleTask1);
        complexTask.addTasks(simpleTask2);

        System.out.println(Task.getTaskCount());

        complexTask.tasksTrue();

        System.out.println(complexTask.getSubTasks()[0].isStatus());
        System.out.println(complexTask.getSubTasks()[1].isStatus());
        System.out.println(complexTask.getSubTasks()[2].isStatus());

    }
}