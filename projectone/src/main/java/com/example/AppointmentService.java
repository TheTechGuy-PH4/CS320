package com.example;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
    ArrayList<Appointment> data;
    int count;

    public AppointmentService(){
        data = new ArrayList<Appointment>();
    }

    public boolean addAppointment( String appID, Date date, String desc){
        Appointment temp = new Appointment(appID, date, desc);

        if (temp != null){
            if (!data.contains(temp)){
                data.add(temp);
                System.out.println("\nAppointment Added: " + appID);
                count++;
                return true;
            }
        }
        return false;
    }

    public boolean deleteAppointment(String appID){
        for (Appointment temp : data){
            if (temp.getId().equals(appID)){
                data.remove(temp);
                System.out.println("\nDeletion of Appointment: " + appID + ", Complete\n");
                count--;
                printApps();
                return true;
            }
        }
        return false;
    }

    public int size(){
        return count;
    }

    public void printApps(){

        System.out.println("\nAppointment Book");
        System.out.println("====================================================");

        for (Appointment temp: data){
            if (temp != null){
                System.out.println(temp.toString());
                System.out.println("----------------------------------------------------");

            }
        }
        System.out.println("Count: " + count);
    }
}
