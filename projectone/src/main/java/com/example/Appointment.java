package com.example;
import java.util.Date;

//import javax.lang.model.util.ElementScanner;

import java.time.format.DateTimeFormatter;
import java.security.Identity;
import java.time.LocalDate;
import java.time.LocalDate;

public class Appointment {
    final private byte APID_LENGTH;
    final private byte APDESC_LENGTH;
    final private String PREP;
    private final String apId;
    private Date apDate;
    private String apDesc;

    {
        APID_LENGTH = 10;
        APDESC_LENGTH = 50;
        PREP = "DEFAULT";
    }

    public Appointment(String id, Date date, String desc){
        if (id == null){
            throw new IllegalArgumentException("Appointment ID can't be null!");
        }
        else if (id.length() > APID_LENGTH){
            throw new IllegalArgumentException("Appointment ID can't be longer than " + APID_LENGTH + "characters!");
        }
        else {
            this.apId = id;
        }
        setDate(date);
        setDesc(desc);
    }

    public String getId(){
        return apId;
    }
    
    public Date getDate(){
        return apDate;
    }

    public String getDesc(){
        return apDesc;
    }

    public void setDate(Date date){
        if (date == null){
            throw new IllegalArgumentException("Appointment date can't be null");
        }
        else if ( date.before(new Date())){
            throw new IllegalArgumentException("Can't make appointment in the past");
        }
        else {
            this.apDate = date;
        }
    }

    public void setDesc(String desc){
        if (desc == null){
            throw new IllegalArgumentException("Description can't be null");
        }
        else if (desc.length() > APDESC_LENGTH){
            throw new IllegalArgumentException("Description can't be longer than " + APDESC_LENGTH + "characters!");
        }
        else{
            this.apDesc = desc;
        }
    }

    @Override
    public String toString() {
        return "| Appointment ID: " + apId + "| Appointment Date: " + apDate + "| Appointment Description: " + apDesc + " |";
    }
}
