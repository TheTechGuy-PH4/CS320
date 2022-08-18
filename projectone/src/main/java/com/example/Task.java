package com.example;

public class Task {

    final private byte TID_LENGTH;
    final private byte TN_LENGTH;
    final private byte TDesc_LENGTH;
    
    private final String taskID;
    private String taskName;
    private String taskDesc;

    {
        TID_LENGTH = 10;
        TN_LENGTH = 20;
        TDesc_LENGTH = 50;
    }

    public Task( ){
        taskID = "39475";
        taskName = "Operation Excalibur";
        taskDesc = "Getting my damn sword back!";
    }

    public Task(String id, String tn, String td){
        if (id == null){
            throw new IllegalArgumentException("Task ID can't be null!");
        }
        else if (id.length() > TID_LENGTH){
            throw new IllegalArgumentException("Task ID can't be longer than " + TID_LENGTH + "characters!");
        }
        else {
            this.taskID = id;
        }
        setTaskName(tn);
        setTaskDesc(td);
    }

    public String getId(){
        return taskID;
    }
    
    public String getTaskName(){
        return taskName;
    }

    public String getTaskDesc(){
        return taskDesc;
    }

    public void setTaskName(String tn){
        if (tn == null){
            throw new IllegalArgumentException("Task Name can't be null!");
        }
        else if ( tn.length() > TN_LENGTH ){
            throw new IllegalArgumentException("Length can't exceed 10 characters");
        }
        else {
            this.taskName = tn;
        }
    }

    public void setTaskDesc(String td){
        if (td == null){
            throw new IllegalArgumentException("Task Description can't be null");
        }
        else if (td.length() > TDesc_LENGTH){
            throw new IllegalArgumentException("Last Name can't be longer than " + TDesc_LENGTH + "characters!");
        }
        else{
            this.taskDesc = td;
        }
    }

    @Override
    public String toString() {
        return "| Task ID: " + taskID + "| Task Name: " + taskName + "| Task Description: " + taskDesc + " |";
    }

}
