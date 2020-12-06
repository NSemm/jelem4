package com.k7;

public class ReadAllContactsMenuAction implements MenuAction {
    private ContactsService contactsService;

    public ReadAllContactsMenuAction(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @Override
    public void doAction() {
        System.out.println("------------------------");
        for (int i = 0; i < contactsService.getAll().size(); i++) {
            System.out.println(contactsService.getAll().get(i));
        }
        System.out.println("------------------------");
        closeAfter();
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
