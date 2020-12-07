package com.k7.menuAction;

import com.k7.service.ContactsService;
import com.k7.contacts.Contact;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddContactMenuAction implements MenuAction {
    private ContactsService contactsService;



    @Override
    public void doAction() {
        contactsService.add(new Contact("Вася", "06131000165"));
        contactsService.add(new Contact("Петя", "06101565100"));
        contactsService.add(new Contact("Оля", "06131772141"));
        contactsService.add(new Contact("Катя", "06134665174"));
        contactsService.add(new Contact("Олег", "06131471193"));
        System.out.println("Contacts added");
        System.out.println("------------------------");
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
