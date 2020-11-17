package com.library.person.client;

import com.library.person.Person;

public class Client extends Person {
    private boolean readingBook;
    private boolean registered;
    private boolean late;

    public void loanApplication() {
        if (isRegistered()) {
            this.setReadingBook(true);
        } else {
            System.out.println("You aren't registered to loan application");
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "readingBook=" + readingBook +
                ", registered=" + registered +
                ", late=" + late +
                '}';
    }

    public void devolution() {
        if (this.isReadingBook()) {
            this.setReadingBook(false);
        } else {
            System.out.println("You aren't reading a book to return it!");
        }
    }

    public boolean isReadingBook() {
        return readingBook;
    }
    public void setReadingBook(boolean readingBook) {
        this.readingBook = readingBook;
    }

    public boolean isRegistered() {
        return registered;
    }
    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public boolean isLate() {
        return late;
    }
    public void setLate(boolean late) {
        this.late = late;
    }
}
