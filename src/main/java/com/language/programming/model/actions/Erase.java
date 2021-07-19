package com.language.programming.model.actions;

import com.language.programming.model.Book;
import com.language.programming.model.Action;

public class Erase implements Action {

    private Book book;

    public Erase(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        this.book.erase();
    }

    @Override
    public void cancel() {
        this.book.write();
    }

}
