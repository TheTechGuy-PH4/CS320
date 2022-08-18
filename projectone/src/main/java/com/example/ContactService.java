package com.example;
import java.util.ArrayList;

public class ContactService {
    ArrayList<Contact> data;
    int count;

    public ContactService(){
        data = new ArrayList<Contact>();
    }

    public boolean addContact(String contactID, String firstName, String lastName, String Number, String Address){
        Contact temp = new Contact(contactID, firstName, lastName, Number, Address);
        if (temp != null){
            if (!data.contains(temp)){
                data.add(temp);
                System.out.println("\nContact Added: " + contactID);
                count++;
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String contactID){
        for (Contact temp : data){
            if (temp.getId().equals(contactID)){
                data.remove(temp);
                System.out.println("\nDeletion of Contact: " + contactID + ", Complete\n");
                count--;
                printContacts();
                return true;
            }
        }
        return false;
    }

    public boolean updateContactFirstName(String contactID, String firstName){
        for (Contact temp : data){
            if (temp.getId().equals(contactID)){
                System.out.println("\nRequested Contact for First Name Update");
                System.out.println("====================================================");
                System.out.println(temp.toString()+ "\n");
                temp.setFirstName(firstName);
                System.out.println("First Name Update Complete: " + contactID);
                System.out.println("New First Name: " + firstName);
                System.out.println("====================================================");
                System.out.println(temp.toString());
                return true;
            }
        }
        return false;
    }

    public boolean updateContactLastName(String contactID, String lastName){
        for (Contact temp : data){
            if (temp.getId().equals(contactID)){
                System.out.println("\nRequested Contact for Last Name Update");
                System.out.println("====================================================");
                System.out.println(temp.toString()+ "\n");
                temp.setLastName(lastName);
                System.out.println("Last Name Update Complete: " + contactID);
                System.out.println("New Last Name: " + lastName);
                System.out.println("====================================================");
                System.out.println(temp.toString());
                return true;
            }
        }
        return false;
    }

    public boolean updateContactNumber(String contactID, String Number){
        for (Contact temp : data){
            if (temp.getId().equals(contactID)){
                System.out.println("\nRequested Contact for Phone Number Update");
                System.out.println("====================================================");
                System.out.println(temp.toString()+ "\n");
                temp.setNumber(Number);
                System.out.println("Contact Phoner Number Update Complete: " + contactID);
                System.out.println("New Phone Number: " + Number);
                System.out.println("====================================================");
                System.out.println(temp.toString());
                return true;
            }
        }
        return false;
    }

    public boolean updateContactAddress(String contactID, String Address){
        for (Contact temp : data){
            if (temp.getId().equals(contactID)){
                System.out.println("\nRequested Contact for Address Update");
                System.out.println("====================================================");
                System.out.println(temp.toString()+ "\n");
                temp.setAddress(Address);
                System.out.println("Address Update Complete: " + contactID);
                System.out.println("New Address: " + Address);
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

    public void printContacts(){

        System.out.println("\nContact Book");
        System.out.println("====================================================");

        for (Contact temp: data){
            if (temp != null){
                System.out.println(temp.toString());
                System.out.println("----------------------------------------------------");
            }
        }
        System.out.println("Count: " + count);
    }
}
