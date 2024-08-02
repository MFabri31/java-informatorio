package poo.nivel2;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList()<>; 

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void showTasks(){
        for (Task task : this.tasks) {
            System.out.println(task.getTitle());
        }
    }

}
