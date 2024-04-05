package edu.miu.cs489;

import edu.miu.cs489.domain.Contact;
import edu.miu.cs489.domain.Email;
import edu.miu.cs489.domain.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = {
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager"),
                new Contact("Carlos", "Jimenez", "Zappos", "Director"),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager")
        };

        // update phones to contact[0]
        List<Phone> phone1 = new ArrayList<>();
        phone1.add(new Phone("240-133-0011", "Home"));
        phone1.add(new Phone("240-112-0123" , "Mobile"));

        List<Email> email1 = new ArrayList<>();
        email1.add(new Email("dave.sang@gmail.com", "Home"));
        email1.add(new Email("dsanger@argos.com", "Work"));

        contacts[0].setPhoneList(phone1);
        contacts[0].setEmailList(email1);

        // update phones to contact[0]
        List<Phone> phone2 = new ArrayList<>();
        phone2.add(new Phone("412-116-9988", "Work"));

        List<Email> email2 = new ArrayList<>();
        email2.add(new Email("ali@bmi.com", "Work"));

        contacts[2].setPhoneList(phone2);
        contacts[2].setEmailList(email2);

        printContact(contacts);
    }

    private static void printContact(Contact[] contacts) {
        // Sort ascending order of the Last Names
        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));

        System.out.println("Printed in Json Format\n[");
        for (Contact contact : contacts) {
            System.out.println(contact.toJsonString());
        }
        System.out.println("]");
    }
}