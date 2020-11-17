package com.library.person.employee;

import com.library.person.Person;
import com.library.person.client.Client;

public class Librarian extends Person {

    public void check(Client client) {
        client.setRegistered(client.getCpf() == null);
    }

    public void clientLate(Client client) {
        if (client.isReadingBook()) {
            client.setLate(true);
        } else {
            System.out.println("The client arent reading book!");
        }
    }

    public void checkDelay(Client client) {
        if (client.isLate()) {
            sendNotification(client);
        } else {
            System.out.println(client.getName() + " aren't late.");
        }
    }

    public void sendNotification(Client client) {
        System.out.println(client.getName() + " you have to return the book!");
    }
}
