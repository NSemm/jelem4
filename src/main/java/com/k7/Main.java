package com.k7;

import com.k7.contacts.ContactType;
import com.k7.menuAction.*;
import com.k7.service.ContactsService;
import com.k7.service.InMemoryContactsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsService contactsService = new InMemoryContactsService();
        //ContactType contactType = new ContactType();
        IoContactsToFile ioContactsToFile = new IoContactsToFile(contactsService);
        Menu menu = new Menu(sc);
        ioContactsToFile.add();
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new AddContactMenuAction(contactsService, sc,ioContactsToFile));
        menu.addAction(new SearchByPhoneContactsMenuAction(contactsService, sc));
        menu.addAction(new SearchByNameContactsMenuAction(contactsService, sc));
        menu.addAction(new RemoveContactMenuAction(contactsService, sc,ioContactsToFile));
        menu.addAction(new SearchIPMenuAction());
        menu.addAction(new ExitMenuAction());
        menu.run();

    }
}
