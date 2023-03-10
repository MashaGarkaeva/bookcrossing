package com.bookcross;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddBookScreen extends AppCompatActivity {

    EditText name_book;
    EditText auhtor_book;
    Button save;
    Button prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
        name_book = findViewById(R.id.name_book);
        auhtor_book = findViewById(R.id.auhtor_book);
        prof = findViewById(R.id.see_place_books);
        save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseHelper = new DatabaseHelper(AddBookScreen.this);
                databaseHelper.addBook(name_book.getText().toString().trim(),
                        auhtor_book.getText().toString().trim());
            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        resetUI();
    }
    @Override
    public void onRestart(){
        super.onRestart();
    }
    @Override
    public void onStart(){
        super.onStart();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onStop(){
        super.onStop();
    }
    @Override
    public void onPause(){
        super.onPause();
    }
    private void resetUI() {
    }

    public void onClick(View view) {
        Intent intent = new Intent(AddBookScreen.this, ProfilScreen.class);
        AddBookScreen.this.startActivity(intent);
    }
}
