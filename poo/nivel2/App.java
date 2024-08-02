package poo.nivel2;

public class App {
    public static void main(String[] args) {
        System.out.println("==== TODO APP ====");

        TaskList taskList = new TaskList();

        Task task1 = new Task("Run", "Run 30 min...");

        taskList.addTask(task1);

        taskList.showTasks();

    }
}
