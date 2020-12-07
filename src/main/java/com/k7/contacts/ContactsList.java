package com.k7.contacts;

import java.util.Arrays;

public class ContactsList {
    private Contact[] contacts = new Contact[0];

    private void checkIndex(int index) {
        if (index >= contacts.length || index < 0)
            throw new IndexOutOfBoundsException();
    }

    public Contact get(int index) {
        checkIndex(index);
        return contacts[index];
    }

    public void set(int index, Contact c) {
        checkIndex(index);
        contacts[index] = c;
    }

    public void add(Contact c) {
        contacts = Arrays.copyOf(contacts, contacts.length + 1);
        contacts[contacts.length - 1] = c;
    }

    public void remove(int index) {
        checkIndex(index);
        Contact[] temp = Arrays.copyOf(contacts, contacts.length - 1);
        for (int i = 0; i < temp.length; i++) temp[i] = i < index ? contacts[i] : contacts[i + 1];
        contacts = temp;
    }

    public int size() {
        return contacts.length;
    }
}
