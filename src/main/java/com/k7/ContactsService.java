package com.k7;

public interface ContactsService {
    ContactsList getAll();
    void remove(int index);
    void add();
}
