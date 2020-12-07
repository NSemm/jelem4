package com.k7.menuAction;

import com.k7.service.ContactsService;

public class ReadAllContactsMenuAction implements MenuAction {
    private ContactsService contactsService;

    public ReadAllContactsMenuAction(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @Override
    public void doAction() {
        System.out.println("------Contact list------");
        for (int i = 0; i < contactsService.getAll().size(); i++) {
            System.out.println(i+1 + ". "+contactsService.getAll().get(i));
        }
        System.out.println("------------------------");
    }

    @Override
    public String getName() {
        return "Show all contacts";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
