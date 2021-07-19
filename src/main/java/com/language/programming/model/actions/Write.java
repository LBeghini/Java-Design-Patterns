package com.language.programming.model.actions;

import com.language.programming.model.Book;
import com.language.programming.model.Action;

public class Write implements Action {

    private Book book;

    public Write(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        this.book.write();
    }

    @Override
    public void cancel() {
        this.book.erase();
    }

}
