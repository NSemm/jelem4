package com.k7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsService contactsService = new InMemoryContactsService();
        contactsService.add();
        Menu menu = new Menu();
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new ExitMenuAction());
        menu.run(sc);

    }
}
