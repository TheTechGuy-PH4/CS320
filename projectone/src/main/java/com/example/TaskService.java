package com.example;
import java.util.ArrayList;

public class TaskService {
    ArrayList<Task> data;
    int count;

    public TaskService(){
        data = new ArrayList<Task>();
    }

    public boolean addTask( String taskID, String taskName, String taskDescription){
        Task temp = new Task(taskID, taskName, taskDescription);

        if (temp != null){
            if (!data.contains(temp)){
                data.add(temp);
                System.out.println("\nTask Added: " + taskID);
                count++;
                return true;
            }
        }
        return false;

    }

    public boolean deleteTask( String taskID){
        for (Task temp : data){
            if (temp.getId().equals(taskID)){
                data.remove(temp);
                System.out.println("\nDeletion of Task ID: " + taskID + ", Complete\n");
                count--;
                printTasks();
                return true;
            }
        }
        return false;
    }

    public boolean updateTaskName(String taskID, String taskName){
        for (Task temp : data){
            if (temp.getId().equals(taskID)){
                System.out.println("\nRequested Task for Task Name Update");
                System.out.println("====================================================");
                System.out.println(temp.toString()+ "\n");
                temp.setTaskName(taskName);
                System.out.println("Task Name Update Complete: " + taskID);
                System.out.println("New Task Name: " + taskName);
                System.out.println("====================================================");
                System.out.println(temp.toString());
                return true;
            }
        }
        return false;
    }

    public boolean updateTaskDescription(String taskID, String taskDescription){
        for (Task temp : data){
            if (temp.getId().equals(taskID)){
                System.out.println("\nRequested Task for Task Description Update");
                System.out.println("====================================================");
                System.out.println(temp.toString()+ "\n");
                temp.setTaskDesc(taskDescription);
                System.out.println("Task Description Update Complete: " + taskID);
                System.out.println("New Task Descripton: " + taskDescription);
                System.out.println("====================================================");
                System.out.println(temp.toString());
                return true;
            }
        }
        return false;
    }

    public int size(){
        return count;
    }

    public void printTasks(){

        System.out.println("\nTask Book");
        System.out.println("====================================================");

        for (Task temp: data){
            if (temp != null){
                System.out.println(temp.toString());
                System.out.println("----------------------------------------------------");
            }
        }
        System.out.println("Count: " + count);
    }
}
