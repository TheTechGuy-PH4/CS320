package com.example;
import java.util.Date;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Create a Contact object
        Contact TheContact = new Contact("GRE45Y", "Phillip", "Hogan", "2146823446", "124 Homer Ave SW");
        //Print/Display Created Contact
        System.out.println("Contact: " + TheContact.getId());
        System.out.println("====================================================");
        System.out.println(TheContact.toString());
        System.out.println("====================================================");

        System.out.println();
        //Create a Contact Service Instance
        ContactService theCS = new ContactService();
        System.out.println("Welcome to Contact Service!");
        //Add Contacts to the Contact Service Instance
        theCS.addContact("GRE45Y", "Phillip", "Hogan", "2146823446", "124 Homer Ave SW");
        theCS.addContact("YOLO", "Venum", "Hogan", "2196847446", "124 Homer Ave SW");
        theCS.addContact("IRON", "Blaze", "Hogan", "2149825446", "124 Homer Ave SW");
        theCS.addContact("OLDTIMER", "Rob", "Stark", "2344596732", "129 Homer Ave SE");
        theCS.addContact("CODE4LIFE", "Victor", "Speed", "7573459012", "120 Homer Ave SW");
        //Print all the contacts out 
        theCS.printContacts();
        //Delete Contact
        theCS.deleteContact("YOLO");
        
        System.out.println();
        //Update First Name
        //*Error Test */
        //theCS.updateContactFirstName("GRE45Y", "Lord Obsidian");
        theCS.updateContactFirstName("GRE45Y", "Carnage");
        theCS.printContacts();

        System.out.println();
        //Update Last Name
        theCS.updateContactLastName("IRON", "Rider");
        theCS.printContacts();

        System.out.println();
        //Update Contact Number
        theCS.updateContactNumber("OLDTIMER", "1234567890");
        theCS.printContacts();

        System.out.println();
        //Update Contact Address
        theCS.updateContactAddress("CODE4LIFE", "131 Homer Ave S");

        //Compare the Updated Contact Book
        System.out.println("\nUpdated Contact Book");
        System.out.println("====================================================");
        theCS.printContacts();

        //========================================================================================================================
        //Task and Task Service Trial 

        System.out.println("\nTask and Task Service Trial");
        System.out.println("====================================================");



        //Create Task Object
        Task theTask = new Task("R8", "ROGER THAT!", "YES SIR!");
        //Print/Display Created Task
        System.out.println("Task: " + theTask.getId());
        System.out.println("====================================================");
        System.out.println(theTask.toString());
        System.out.println("====================================================");

        System.out.println();

        //Create a Task Service Object
        TaskService theTS = new TaskService();
        System.out.println("Welcome to Task Service!");

        //Add Tasks to the Service
        theTS.addTask("61", "Uhm", "Ok");
        theTS.addTask("YUP45", "Ops Take Over", "World Domination");
        theTS.addTask("CLOUD9", "Ops Erb", "You know what I'm here for.");
        theTS.addTask("AVENGERS", "Ops Assemble", "Save the World");

        //Print/Display all of the added Tasks
        theTS.printTasks();

        //Delete Task
        theTS.deleteTask("61");

        //Update Task Name
        theTS.updateTaskName("YUP45", "Ops We Out Here");

        theTS.printTasks();

        //Update Description
        theTS.updateTaskDescription("CLOUD9", "Its About To Go Down!");

        //Compare the Update Task Book
        System.out.println("\nUpdated Task Book");
        System.out.println("====================================================");
        theTS.printTasks();

        //========================================================================================================================
        //Appointment and Appointment Service Trial
        System.out.println("\nAppointment and Appoinment Service Trial");
        System.out.println("====================================================");
        Date date = new Date(2022, 8, 8);
        
        Appointment theApp = new Appointment("Ankle", date, "Check Up");
        //Print/Display Created Appointment
        System.out.println("Appointment: " + theApp.getId());
        System.out.println("====================================================");
        System.out.println(theApp.toString());
        System.out.println("====================================================");

        System.out.println();

        //Create Appointment Service
        AppointmentService theAS = new AppointmentService();
        System.out.println("Welcome to Appointment Service");

        //Add Appointment
        theAS.addAppointment("Arm", date, "Broken");
        theAS.addAppointment("Back", date, "Pulled");
        theAS.addAppointment("Leg", date, "Twisted");

        //Pritn/Display all of the added Appointments
        theAS.printApps();

        //Delete Appointments
        theAS.deleteAppointment("Back");

        //Updated Appointment Book
        System.out.println("\nUpdated Appointment Book");
        System.out.println("====================================================");
        theAS.printApps();















    }
}
