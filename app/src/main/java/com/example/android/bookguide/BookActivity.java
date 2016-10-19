package com.example.android.bookguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    public static final String LOG_TAG = BookActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ArrayList<String> book = new ArrayList<>();
        book.add("Holes");
        book.add("The Time Machine");
        book.add("Harry Potter and The Sorceres Stone");
        book.add("To Kill A Mockingbird");
        book.add("Frankenstein");
        book.add("Dracula");
        book.add("Sidartha");

        // Find a reference to the {@link ListView} in the layout
        ListView bookListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, book);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        bookListView.setAdapter(adapter);
    }
}