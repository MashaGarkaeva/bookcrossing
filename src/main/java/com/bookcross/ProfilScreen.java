package com.bookcross;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ProfilScreen extends AppCompatActivity {

    EditText name_user;
    Button see_place_books;
    ImageView icon_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        name_user = findViewById(R.id.name_user);
        icon_add = findViewById(R.id.icon_add);
        see_place_books = findViewById(R.id.see_place_books);
        see_place_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilScreen.this, MapsScreen.class);
                ProfilScreen.this.startActivity(intent);
            }
        });
        icon_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfilScreen.this, AddBookScreen.class);
                ProfilScreen.this.startActivity(intent);
            }
        });

        name_user.setText(DatabaseHelper.COLUMN_FIO);

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

    }

}
