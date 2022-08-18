package com.example;

import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTest {
    private String tid, tn, td;
    private String errTid, errTn, errTd;
    private String print;

    @BeforeEach
    void variables(){
        tid = "0987654321";
        tn = "Operation Excalibur";
        td = "Getting my damn sword back!";
        
        errTid = "12345678901";
        errTn = "Operation Excalibur 2704";
        errTd = "Getting my damn sword back!........................................................"; 
    }

    @Test
    void testGetTaskID(){
        Task task = new Task(tid, tn, td);
        assertNotNull(task.getId());
        assertFalse(task.getId().length() > 10);
        assertEquals(tid, task.getId());
    }

    // Test for Task Name
    @Test
    void testSetTaskName(){
        Task task = new Task();
        assertThrows(IllegalArgumentException.class,
            ()-> task.setTaskName(null));
        assertThrows(IllegalArgumentException.class, 
            () -> task.setTaskName(errTn));
        task.setTaskName(tn);
        assertEquals(tn, task.getTaskName());
    }

    @Test 
    void testGetTaskName(){
        Task task = new Task(tid, tn, td);
        assertNotNull(task.getTaskName());
        assertFalse(task.getTaskName().length() > 20);
        assertEquals(tn, task.getTaskName());
    }
    // Test for Task Description
    @Test
    void testSetTaskDesc(){
        Task task = new Task();
        assertThrows(IllegalArgumentException.class,
            ()-> task.setTaskDesc(null));
        assertThrows(IllegalArgumentException.class, 
            () -> task.setTaskDesc(errTd));
        task.setTaskDesc(td);
        assertEquals(td, task.getTaskDesc());
    }

    @Test
    void testGetTaskDesc(){
        Task task = new Task(tid, tn, td);
        assertNotNull(task.getTaskDesc());
        assertFalse(task.getTaskDesc().length() > 50);
        assertEquals(td, task.getTaskDesc());
    }

    @Test
    void testToString(){
        Task task = new Task(tid, tn, td);
        String print = "| Task ID: " + tid + "| Task Name: " + tn + "| Task Description: " + td + " |";
        assertEquals(print, task.toString());
    }
}
