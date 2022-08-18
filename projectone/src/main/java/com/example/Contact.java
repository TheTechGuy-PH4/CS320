package com.example;

public class Contact {
    final private byte CID_LENGTH;
    final private byte CFN_LENGTH;
    final private byte CLN_LENGTH;
    final private byte CN_LENGTH;
    final private byte CA_LENGTH;
    
    private final String contactID;
    private String firstName;
    private String lastName;
    private String Number;
    private String Address;

    {
        CID_LENGTH = 10;
        CFN_LENGTH = 10;
        CLN_LENGTH = 10;
        CN_LENGTH = 10;
        CA_LENGTH = 30;
    }

    public Contact(String id, String fn, String ln, String num, String adds){
        if (id == null){
            throw new IllegalArgumentException("Contact ID can't be null!");
        }
        else if (id.length() > CID_LENGTH){
            throw new IllegalArgumentException("Contact ID can't be longer than " + CID_LENGTH + "characters!");
        }
        else {
            this.contactID = id;
        }
        setFirstName(fn);
        setLastName(ln);
        setNumber(num);
        setAddress(adds);
    }

    public String getId(){
        return contactID;
    }
    
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getNumber(){
        return Number;
    }

    public String getAddres(){
        return Address;
    }

    public void setFirstName(String fn){
        if (fn == null){
            throw new IllegalArgumentException("First Name can't be null");
        }
        else if ( fn.length() > CFN_LENGTH ){
            throw new IllegalArgumentException("Length can't exceed " + CFN_LENGTH + " characters");
        }
        else {
            this.firstName = fn;
        }
    }

    public void setLastName(String ln){
        if (ln == null){
            throw new IllegalArgumentException("Last Name can't be null");
        }
        else if (ln.length() > CLN_LENGTH){
            throw new IllegalArgumentException("Last Name can't be longer than " + CLN_LENGTH + "characters!");
        }
        else{
            this.lastName = ln;
        }
    }

    public void setNumber(String n){
        if (n == null){
            throw new IllegalArgumentException("Phone Number can't be null");
        }
        else if (n.length() > CN_LENGTH){
            throw new IllegalArgumentException("Number can't be longer than " + CN_LENGTH + "characters!");
        }
        else{
            this.Number = n;
        }
    }

    public void setAddress(String ad){
        if (ad == null){
            throw new IllegalArgumentException("Last Name can't be null");
        }
        else if (ad.length() > CA_LENGTH){
            throw new IllegalArgumentException("Last Name can't be longer than " + CA_LENGTH + "characters!");
        }
        else{
            this.Address = ad;
        }
    }

    @Override
    public String toString() {
        
        return "| Contact ID: " + contactID + "| First Name: " + firstName + "| Last Name: " + lastName + "| Number: " + Number + "| Address: " + Address + " |";
    }
}
