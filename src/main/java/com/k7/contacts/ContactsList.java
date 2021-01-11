package com.k7.contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactsList {
    private List<Contact> contacts = new ArrayList<>();

//    private void checkIndex(int index) {
//        if (index >= contacts.size() || index < 0)
//            throw new IndexOutOfBoundsException();
//    }

    public Contact get(int index) {
        return contacts.get(index);
    }

    public void set(int index, Contact c) {
        //checkIndex(index);
        contacts.set(index, c);
    }

    public void add(Contact c) {
        contacts.add(c);
    }

    public void remove(int index) {
//        checkIndex(index);
//        Contact[] temp = Arrays.copyOf(contacts, contacts.length - 1);
//        for (int i = 0; i < temp.length; i++) temp[i] = i < index ? contacts[i] : contacts[i + 1];
//        contacts = temp;
        contacts.remove(index);
    }

    public int size() {
        return contacts.size();
    }
}
