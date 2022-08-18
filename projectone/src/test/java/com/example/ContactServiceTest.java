package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class ContactServiceTest {
    
    ContactService cs = new ContactService();    
    int count;
    @Test
    public void testAddContact(){
        cs.addContact("012293", "Phil", "Hogan", "2146823446", "124 Homer Ave SW");
        count++;
        assertEquals(count, cs.size());

    }

    @Test
    public void testUCFN(){
        cs.addContact("012293", "Phil", "Hogan", "2146823446", "124 Homer Ave SW");
        boolean test = cs.updateContactFirstName("012293", "Phillip");
        assertEquals( true, test );
    }

    @Test
    public void testUCLN(){
        cs.addContact("012293", "Phil", "Hogan", "2146823446", "124 Homer Ave SW");
        boolean test = cs.updateContactLastName("012293", "Hog");
        assertEquals( true, test );
    }

    @Test
    public void testUCN(){
        cs.addContact("012293", "Phil", "Hogan", "2146823446", "124 Homer Ave SW");
        boolean test = cs.updateContactNumber("012293", "1111111111");
        assertEquals( true, test );
    }

    @Test
    public void testUCA(){
        cs.addContact("012293", "Phil", "Hogan", "2146823446", "124 Homer Ave SW");
        boolean test = cs.updateContactAddress("012293", "1738 Milly Rock on any block");
        assertEquals( true, test );
    }

    @Test
    public void testDeleteContact(){
        cs.addContact("012293", "Phil", "Hogan", "2146823446", "124 Homer Ave SW");
        count++;
        cs.deleteContact("012293");
        count--;
        assertEquals(count, cs.size());
    }


}
