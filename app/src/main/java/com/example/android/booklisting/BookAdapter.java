package com.example.android.booklisting;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import static android.R.attr.resource;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each Book object
 */

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Constructs a new {@link BookAdapter}
     * @param context of the app
     * @param book is the list of books
     */

    public BookAdapter(Context context, List<Book> book) {
        super(context, 0, book);
    }

    /**
     * Returns a list item view that displays book info at position
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if there is existing list item view otherwise inflate new list item
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        //Find the book at the given position in the list
        Book currentBook = getItem(position);

        //Find text view for title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title_text_view);
        //Display title
        titleView.setText(currentBook.getTitle());

        //Find author view for title
        TextView authorView = (TextView) listItemView.findViewById(R.id.author_text_view);
        //Display title
        authorView.setText(currentBook.getAuthors());

        return listItemView;
    }
}
