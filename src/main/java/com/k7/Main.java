package com.k7;

import com.k7.menuAction.*;
import com.k7.service.ContactsService;
import com.k7.service.InMemoryContactsService;
import com.k7.toFile.ContactsToFile;
import com.k7.toFile.IoContactsToFile;
import com.k7.toFile.NioContactsToFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsService contactsService = new InMemoryContactsService();
        ContactsToFile contactsToFile = new NioContactsToFile(contactsService);
        Menu menu = new Menu(sc);
        contactsToFile.read();
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new AddContactMenuAction(contactsService, sc,contactsToFile));
        menu.addAction(new SearchByPhoneContactsMenuAction(contactsService, sc));
        menu.addAction(new SearchByNameContactsMenuAction(contactsService, sc));
        menu.addAction(new RemoveContactMenuAction(contactsService, sc,contactsToFile));
        menu.addAction(new SearchIPMenuAction());
        menu.addAction(new ExitMenuAction());
        menu.run();

    }
}
