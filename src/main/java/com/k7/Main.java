package com.k7;

import com.k7.menuAction.AddContactMenuAction;
import com.k7.menuAction.ExitMenuAction;
import com.k7.menuAction.ReadAllContactsMenuAction;
import com.k7.menuAction.RemoveContactMenuAction;
import com.k7.service.ContactsService;
import com.k7.service.InMemoryContactsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsService contactsService = new InMemoryContactsService();
        Menu menu = new Menu();
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new AddContactMenuAction(contactsService));
        menu.addAction(new RemoveContactMenuAction(contactsService,sc));
        menu.addAction(new ExitMenuAction());
        menu.run(sc);

    }
}
