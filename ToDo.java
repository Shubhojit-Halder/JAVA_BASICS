import java.io.*;
import java.util.*;

class Task {
    private String name;
    private Date dueDate;
    private boolean completed;

    public Task(String name, Date dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public String getName() {
        return this.name;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean work) {
        this.completed = work;
    }

}

class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(String taskName) {
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

    public void displayTasks() {
        System.out.println("Todo List:");
        for (Task task : tasks) {
            System.out.println("Task: " + task.getName() +
                    " | Due Date: " + task.getDueDate() +
                    " | Status: " + (task.isCompleted() ? "Completed" : "Not Completed"));
        }
    }
}

public class ToDo {
 public static void main(String[] args) throws IOException{
 TodoList todoList = new TodoList();
 // Add tasks
//  Task task1 = new Task("Complete project", new Date());
//  Task task2 = new Task("Read a book", new Date());
 while(true)
 {
    System.out.println("1. to add newtask\n2. displayTasks\n3.updateTask\n4. removeTask\n5. to exit");
    Scanner sc= new Scanner(System.in);
    int key=sc.nextInt();
    switch (key) {
        case 1:
            System.out.println("Enter a task: ");
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String s=br.readLine();
            Task newTask = new Task(s, new Date());
            todoList.addTask(newTask);
            break;
        case 2:
            todoList.displayTasks();
            break;
        case 3:
            System.out.println("Enter Task Name: ");
            // String st=sc.nextLine();

            break;
        case 4:
            System.out.println("Enter Task Name: ");
            String str=sc.nextLine();
            todoList.removeTask(str);
            break;
        default:
            break;
    }
 }
//  todoList.addTask(task1);
//  todoList.addTask(task2);
//  // Display tasks
//  todoList.displayTasks();
//  // Mark a task as completed
//  task1.setCompleted(true);
//  // Display updated tasks
//  todoList.displayTasks();
//  // Remove a task
//  todoList.removeTask("Read a book");
//  // Display final tasks
//  todoList.displayTasks();
 }
}
