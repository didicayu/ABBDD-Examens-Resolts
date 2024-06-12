package Problema3;

public final class Contact {
    String contact;
    public Contact(String contact){
        if(contact.isEmpty() || contact == null){ throw new IllegalArgumentException("(.y.)"); }
        this.contact = contact;
    }
}
