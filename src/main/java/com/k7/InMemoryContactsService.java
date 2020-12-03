package com.k7;

public class InMemoryContactsService implements ContactsService {
    ContactsList contactsList = new ContactsList();

    @Override
    public ContactsList getAll() {
        return contactsList;
    }

    @Override
    public void remove(int index) {
        contactsList.remove(index);
    }

    @Override
    public void add() {
        contactsList.add(new Contact("Вася", "06131000165"));
        contactsList.add(new Contact("Петя", "06101565100"));
        contactsList.add(new Contact("Оля", "06131772141"));
        contactsList.add(new Contact("Катя", "06134665174"));
        contactsList.add(new Contact("Олег", "06131471193"));
    }
}
