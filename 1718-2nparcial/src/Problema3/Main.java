package Problema3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a Place object
        Place place = new Place("Meeting Room A");

        // Create a DayOfYear object
        DayOfYear dayOfYear = new DayOfYear(15, 6, 2024);

        // Create HoursMinutes objects for begin and end times
        HoursMinutes begin = new HoursMinutes(10, 30);
        HoursMinutes end = new HoursMinutes(12, 0);

        // Create Contact objects
        Contact contact1 = new Contact("Alice");
        Contact contact2 = new Contact("Bob");

        // Create a list of contacts
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);

        // Use the Builder to create a CalendarItem object
        CalendarItem item = CalendarItem.Builder.create("Team Meeting")
                .in(place)
                .at(dayOfYear)
                .from(begin)
                .to(end)
                .with(contact1)
                .with(contact2)
                .build();

        // Print out details of the created CalendarItem
        System.out.println("Event: " + item.getName());
        System.out.println("Location: " + item.getPlace().placeName);
        System.out.println("Date: " + item.getDate().day + "/" + item.getDate().month + "/" + item.getDate().year);
        System.out.println("Start Time: " + item.getBegin().getHours() + ":" + item.getBegin().getMinutes());
        System.out.println("End Time: " + item.getEnd().getHours() + ":" + item.getEnd().getMinutes());
        System.out.println("Attendees:");
        for (Contact contact : item.getOthers()) {
            System.out.println(" - " + contact.contact);
        }
    }
}