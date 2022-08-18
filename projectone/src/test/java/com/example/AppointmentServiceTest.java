package com.example;

import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {
    
    AppointmentService cs = new AppointmentService();    
    int count;
    private String id, desc;
    private Date date;

    @BeforeEach
    void variables(){
        id = "0987654321";
        date = new Date(2025, Calendar.JANUARY, 22);
        desc = "This is a default description!";
    }
    @Test
    void testAddAppointment(){
        cs.addAppointment(id, date, desc);
        count++;
        assertEquals(count, cs.size());

    }

    @Test
    void testDeleteAppointment(){
        cs.addAppointment(id, date, desc);
        count++;
        cs.deleteAppointment("0987654321");
        count--;
        assertEquals(count, cs.size());
    }
}
