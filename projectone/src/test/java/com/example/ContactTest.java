package com.example;

import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    private String id, fn, ln, num, address;
    private String errId, errFn, errLn, errNum, errAdd;
    

    @BeforeEach
    void variables(){
        id = "0987654321";
        fn = "Phillip";
        ln = "Hogan";
        num = "2146823446";
        address = "124 Homer Ave SW";

        errId = "12345678901";
        errFn = "Phillip Hogan";
        errLn = "Phillip Hogan";
        errNum = "09876543210";
        errAdd = "124 Homer Ave SW, Pacific, WA 98047, United States Of America";
        
    }

    @Test
    void testGetContactID(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertNotNull(contact.getId());
        assertFalse(contact.getId().length() > 10);
        //assertEquals(contact.getId().length(), 10);
        assertEquals(id, contact.getId());
    }

    // Test for First Name
    @Test
    void testSetFirstName(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertThrows(IllegalArgumentException.class, 
            () -> contact.setFirstName(null));;
        assertThrows(IllegalArgumentException.class,
            () -> contact.setFirstName(errFn));
        contact.setFirstName(fn);
        assertEquals(fn, contact.getFirstName());
    }

    @Test 
    void testGetFirstName(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertNotNull(contact.getFirstName());
        assertFalse(contact.getFirstName().length() > 10);
        //assertEquals(fn, contact.getFirstName());
        assertEquals(fn, contact.getFirstName());
    }
    // Test for Last Name
    @Test
    void testSetLastName(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertThrows(IllegalArgumentException.class, 
            () -> contact.setLastName(null));;
        assertThrows(IllegalArgumentException.class,
            () -> contact.setLastName(errLn));
        contact.setLastName(ln);
        assertEquals(ln, contact.getLastName());
    }

    @Test
    void testGetLastName(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertNotNull(contact.getLastName());
        assertFalse(contact.getLastName().length() > 10);
        //assertEquals(fn, contact.getFirstName());
        assertEquals(ln, contact.getLastName());
    }

    //Test for Number
    @Test
    void testSetNumber(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertThrows(IllegalArgumentException.class, 
            () -> contact.setNumber(null));;
        assertThrows(IllegalArgumentException.class,
            () -> contact.setNumber(errNum));
        contact.setNumber(num);
        assertEquals(num, contact.getNumber());
    }

    @Test
    void testGetNumber(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertNotNull(contact.getNumber());
        assertFalse(contact.getNumber().length() > 10);
        //assertEquals(fn, contact.getFirstName());
        assertEquals(num, contact.getNumber());
    }

    //Test For Address
    @Test
    void testSetAddress(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertThrows(IllegalArgumentException.class, 
            () -> contact.setAddress(null));;
        assertThrows(IllegalArgumentException.class,
            () -> contact.setAddress(errAdd));
        contact.setAddress(address);
        assertEquals(address, contact.getAddres());
    }

    @Test
    void testGetAddress(){
        Contact contact = new Contact(id, fn, ln, num, address);
        assertNotNull(contact.getAddres());
        assertFalse(contact.getAddres().length() > 30);
        //assertEquals(fn, contact.getFirstName());
        assertEquals(address, contact.getAddres());
    }

    @Test
    void testToString(){
        Contact contact = new Contact(id, fn, ln, num, address);
        String print = "| Contact ID: " + id + "| First Name: " + fn + "| Last Name: " + ln + "| Number: " + num + "| Address: " + address + " |";
        assertEquals(print, contact.toString());
    }
}
