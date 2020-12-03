package com.k7;

public class Main {
    public static void main(String[] args) {

ContactsService contactsService = new InMemoryContactsService();
contactsService.add();
        System.out.println(contactsService.getAll().get(3));

    }
}
