package com.k7.menuAction;

import com.k7.service.ContactsService;
import com.k7.contacts.Contact;
import lombok.AllArgsConstructor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AllArgsConstructor
public class AddContactMenuAction implements MenuAction {
    private ContactsService contactsService;
    private Scanner sc;



    @Override
    public void doAction() {
//        System.out.println("Enter name of contact");
//        String name = sc.nextLine();
//        System.out.println("Enter phone number");
//        String phone = sc.nextLine();
//        while (!checkPhone(phone)) {
//            System.out.println("Phone number must have +380xxxxxxx format!\nEnter phone number");
//            phone = sc.nextLine();
//        }
//            contactsService.add(new Contact(name, phone));

        contactsService.add(new Contact("Петя", "06101565100"));
        contactsService.add(new Contact("Оля", "06131772141"));
        contactsService.add(new Contact("Катя", "06134665174"));
        contactsService.add(new Contact("Олег", "06131471193"));
            System.out.println("Contacts added");
            System.out.println("------------------------");

    }

    private boolean checkPhone(String phone) {
        String regex = "(\\+380)(\\d{9})";
        return phone.matches(regex);
    }

    @Override
    public String getName() {
        return "Add contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
