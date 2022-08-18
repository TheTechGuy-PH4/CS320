package com.example;
import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppointmentTest {
    
    private String id, desc;
    private Date date, pastDate;
    private String errorId, errorDesc;
    

    @BeforeEach
    void variables(){
        id = "0987654321";
        date = new Date(2025, Calendar.JANUARY, 22);
        desc = "This is a default description!";
        errorId = "1111111111111111111111111111111111111111";
        errorDesc = "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222";
        pastDate = new Date(0);
    }

    @Test
    void testGetAppointmentID(){
        Appointment appointment = new Appointment(id, date, desc);
        assertNotNull(appointment.getId());
        assertEquals(appointment.getId().length(), 10);
        assertEquals(id, appointment.getId());
    }

    @Test
    void testSetDate(){
        Appointment appointment = new Appointment(id, date, desc);
        assertThrows(IllegalArgumentException.class, 
            () -> appointment.setDate(null));
        assertThrows(IllegalArgumentException.class,
            () -> appointment.setDate(pastDate));
        appointment.setDate(date);
        assertEquals(date, appointment.getDate());
    }

    @Test 
    void testGetDate(){
        Appointment appointment = new Appointment(id, date, desc);
        assertNotNull(appointment.getDate());
        assertEquals(date, appointment.getDate());
    }

    @Test
    void testSetDesc(){
        Appointment appointment = new Appointment(id, date, desc);
        assertThrows(IllegalArgumentException.class, () -> appointment.setDesc(null));
        assertThrows(IllegalArgumentException.class, () -> appointment.setDesc(errorDesc));
        appointment.setDesc(desc);
        assertEquals(desc, appointment.getDesc());
    }

    @Test
    void testGetDesc(){
        Appointment appointment = new Appointment(id, date, desc);
        assertNotNull(appointment.getDesc());
        assertTrue(appointment.getDesc().length() <= 50);
        assertEquals(desc, appointment.getDesc());
    }

    @Test
    void testToString(){
        Appointment appointment = new Appointment(id, date, desc);
        String print = "| Appointment ID: " + id + "| Appointment Date: " + date + "| Appointment Description: " + desc + " |";
        assertEquals(print, appointment.toString());
    }
}
