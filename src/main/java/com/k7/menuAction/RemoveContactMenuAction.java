package com.k7.menuAction;

import com.k7.service.ContactsService;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class RemoveContactMenuAction implements MenuAction {
    private ContactsService contactsService;
    private Scanner sc;

    @Override
    public void doAction() {
        System.out.println("Enter contact's list number for delete");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        while (contactsService.getAll().checkIndex(index)) {
            System.out.println("Invalid index. Repeat action.");
            return;
        }
        System.out.println(contactsService.getAll().get(index).getName() + " deleted");
        System.out.println("------------------------");
        contactsService.remove(index);
    }

    @Override
    public String getName() {
        return "Delete contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
