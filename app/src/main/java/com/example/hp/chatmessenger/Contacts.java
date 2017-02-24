package com.example.hp.chatmessenger;

/**
 * Created by hp on 2/24/2017.
 */
public class Contacts {
    String name;
    String mobile_number;
    String photo_uri;

    public Contacts(String name, String mobile_number, String photo_uri) {
        this.photo_uri =photo_uri;
        this.mobile_number = mobile_number;
        this.name = name;
    }
}
