package com.library;

import com.library.person.client.Client;
import com.library.person.employee.Librarian;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Client client = new Client();

        System.out.println(client.toString());
        librarian.check(client);
        client.loanApplication();
        //client.devolution();
        System.out.println(client.toString());
        //librarian.clientLate(client);
        System.out.println(client.toString());
        librarian.checkDelay(client);

    }
}

