package org.example;
import java.util.LinkedList;
import java.util.Queue;
//10
interface Task {
    void execute();
    boolean isFinished();
}
public class TaskCarousel implements Task{
    private int value;

    public TaskCarousel(int value) {
        this.value = Math.max(value, 0); // Ensure value is not negative
    }

    public int getValue() {
        return value;
    }

    @Override
    public void execute() {
        if (value > 0) {
            value--;
        }
    }

    @Override
    public boolean isFinished() {
        return value == 0;
    }

}
class CompleteByRequestTask implements Task {
    private boolean completed;

    public CompleteByRequestTask() {
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public void execute() {
        // No operation
    }

    @Override
    public boolean isFinished() {
        return completed;
    }
}
class TaskCarousel1 {
    private final Queue<Task> tasks;
    private final int capacity;

    public TaskCarousel1(int capacity) {
        this.capacity = capacity;
        this.tasks = new LinkedList<>();
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public boolean isFull() {
        return tasks.size() >= capacity;
    }

    public boolean addTask(Task task) {
        if (task == null || task.isFinished() || isFull()) {
            return false;
        }
        tasks.offer(task);
        return true;
    }

    public boolean execute() {
        if (isEmpty()) {
            return false;
        }
        Task task = tasks.poll();
        task.execute();
        if (!task.isFinished()) {
            tasks.offer(task); // Re-add the task if it's not finished
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        TaskCarousel1 carousel = new TaskCarousel1(4);
        System.out.println(carousel.isEmpty()); // true
        System.out.println(carousel.isFull()); // false
        System.out.println(carousel.execute()); // false

        TaskCarousel task = new TaskCarousel(2);
        System.out.println(carousel.addTask(task)); // true
        System.out.println(carousel.isEmpty()); // false
        System.out.println(carousel.isFull()); // false
        System.out.println(task.getValue()); // 2
        System.out.println(carousel.execute()); // true
        System.out.println(task.getValue()); // 1
        System.out.println(carousel.execute()); // true
        System.out.println(task.getValue()); // 0
        System.out.println(carousel.execute()); // false
        System.out.println(carousel.isEmpty()); // true

        CompleteByRequestTask completeTask = new CompleteByRequestTask();
        System.out.println(carousel.addTask(completeTask)); // true
        System.out.println(carousel.execute()); // true
        completeTask.complete();
        System.out.println(carousel.execute()); // false
    }
}