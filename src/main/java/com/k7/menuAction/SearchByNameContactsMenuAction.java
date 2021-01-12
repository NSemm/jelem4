package com.k7.menuAction;

import com.k7.contacts.Contact;
import com.k7.contacts.ContactsList;
import com.k7.service.ContactsService;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@AllArgsConstructor
public class SearchByNameContactsMenuAction implements MenuAction {
    private ContactsService contactsService;
    private Scanner sc;

    @Override
    public void doAction() {
        int num = 0;
        System.out.println("Enter the begining of contact name");
        String search = sc.nextLine();
        System.out.println("------Contact list------");
//        for (int i = 0; i < contactsService.getAll().size(); i++) {
//            if (contactsService.getAll().get(i).getName().startsWith(search))
//            System.out.println(++num +". "+contactsService.getAll().get(i));
//        }
        for (Contact contact : contactsService.getAll().getByName(search)) {
            System.out.println(++num + ". " + contact.toString());
        }
        System.out.println("------------------------");
    }

    @Override
    public String getName() {
        return "Search contact by name";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
