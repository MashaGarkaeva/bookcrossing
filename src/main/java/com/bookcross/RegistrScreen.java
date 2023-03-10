package com.bookcross;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrScreen extends AppCompatActivity {
    EditText reg_login;
    EditText reg_password;
    EditText reg_fio;
    Button enter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
        reg_login = findViewById(R.id.reg_login);
        reg_password = findViewById(R.id.reg_password);
        reg_fio = findViewById(R.id.reg_fio);
        enter2 = (Button) findViewById(R.id.enter2);
        enter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper databaseHelper = new DatabaseHelper(RegistrScreen.this);
                databaseHelper.addUser(reg_fio.getText().toString().trim(),
                        reg_login.getText().toString().trim(),
                    reg_password.getText().toString().trim());
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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

}
