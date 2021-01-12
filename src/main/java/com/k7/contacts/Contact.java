package com.k7.contacts;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {
    private String name;
    private String phone;


    @Override
    public String toString() {
        return name + ", " + phone;
    }
}
