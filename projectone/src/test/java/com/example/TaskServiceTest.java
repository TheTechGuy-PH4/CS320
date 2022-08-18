package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TaskServiceTest {

    TaskService cs = new TaskService();    
    int count;
    @Test
    public void testAddTask(){
        cs.addTask("2121", "Dilly Dilly", "Going on a Trip");
        count++;
        assertEquals(count, cs.size());
    }

    @Test
    public void testUpdateTaskName(){
        cs.addTask("2121", "Dilly Dilly", "Going on a Trip");
        boolean test = cs.updateTaskName("2121", "Dilly");
        assertEquals( true, test );
    }

    @Test
    public void testUpdateTasDescription(){
        cs.addTask("2121", "Dilly Dilly", "Going on a Trip");
        boolean test = cs.updateTaskDescription("2121", "");
        assertEquals( true, test );
    }

    @Test
    public void testDeleteTask(){
        cs.addTask("2121", "Dilly Dilly", "Going on a Trip");
        count++;
        cs.deleteTask("2121");
        count--;
        assertEquals(count, cs.size());
    }
}
