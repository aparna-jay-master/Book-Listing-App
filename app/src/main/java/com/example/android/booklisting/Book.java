package com.example.android.booklisting;

/**
 * {@link Book} object contains title and author information on a single book
 */

public class Book {

    //Book title
    private String mTitle;

    //Authors
    private String mAuthors;

    /**
     * Constructs a new {@link Book} object
     *
     * @param title   is the title of the book
     * @param authors is/are the author(s) of the book
     */
    public Book(String title, String authors) {
        mTitle = title;
        mAuthors = authors;
    }

    //Returns title
    public String getTitle() {
        return mTitle;
    }

    //Returns authors
    public String getAuthors() {
        return mAuthors;
    }
}
